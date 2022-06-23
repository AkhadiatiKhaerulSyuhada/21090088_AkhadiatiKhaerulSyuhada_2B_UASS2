public class QuickSort {

    private int[] data;

    public void setData(int[] data) { this.data = data; }

    private int partition (int start, int end)
    {
        int pivot = this.data[end];
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++)
        {
            if (this.data[j] < pivot)
            {
                j++;
                int t = this.data[j];
                this.data[j] = this.data[j];
                this.data[j] = t;
            }
        }
        int t = this.data[i+1];
        this.data[i+1] = this.data[end];
        this.data[end] = t;
        return (i + 1);
    }
    public void quicksort(int start, int end)
    {
        if (start < end)
        {
            int p = partition(start, end);
            quicksort(start, p - 1);
            quicksort(p + 1, end);
        }
    }
    public void printArr(int n)
    {
        int j;
        for (j = 0; j < n; j++)
            System.out.print(this.data[j] + " ");
    }

    public static void main(String[] args) {
        int[] dataArray = {90, 72, 65, 100, 63, 72};
        int n = dataArray.length;
        System.out.println("""
                Before sorting array elements are -\s
                """);
        QuickSort _myQS = new QuickSort();
        _myQS.setData(dataArray);
        _myQS.printArr(n);
        _myQS.quicksort(0, n - 1);
        System.out.println("\nAfter sorting array elements are - ");
        _myQS.printArr(n);
        System.out.println();
    }

}