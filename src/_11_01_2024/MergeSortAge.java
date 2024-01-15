package _11_01_2024;

public class MergeSortAge {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charline", 30),
                new Person("David", 35),
                new Person("Eve", 28),
        };
        mergeSort(people);
        printArray(people);

    }

    private static void mergeSort(Person[] arr) {
        int lengthArr = arr.length;
        if (lengthArr == 1) {
            return;
        }
        int mid = lengthArr / 2;
        Person[] leftArr = new Person[mid];
        Person[] rightArr = new Person[lengthArr - mid];

        for (int i = 0; i < mid; ++i) {
            leftArr[i] = arr[i];
        }
        for (int j = 0; j < lengthArr - mid; ++j) {
            rightArr[j] = arr[j + mid];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    private static void merge(Person[] arr, Person[] leftArr, Person[] rightArr) {
        int leftArrLength = leftArr.length;
        int rightArrLength = rightArr.length;
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;
        while (leftIndex < leftArrLength && rightIndex < rightArrLength) {
            if (leftArr[leftIndex].age > rightArr[rightIndex].age) {
                arr[arrIndex] = leftArr[leftIndex];
                leftIndex++;
            } else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }

        while (leftIndex < leftArrLength) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        while (rightIndex < rightArrLength) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }

    private static void printArray(Person[] arr) {
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
