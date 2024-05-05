public class InsertionSort {
    public static void insertionSort(int[] arr) {
        // Paso 1: Inicialización y selección del elemento a insertar
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Paso 2: Comparación y desplazamiento de elementos
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            // Paso 3: Inserción del elemento en la posición correcta
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Paso 4: Crear un arreglo y llamar al método de ordenamiento
        int[] arr = {38, 27, 43, 3, 82, 0};
        insertionSort(arr);

        // Paso 5: Impresión del arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
