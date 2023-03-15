public class Main {
    public static void main(String[] args) {
        double[] array = {-2,-1,2,-3,-4,-5,6,-7,-8,-9};
        int max=0;
        for (int i=0; i<array.length; i++) {
            if (Math.abs(array[i]) > Math.abs(array[max])) {
                max=i;
            }
        }
        System.out.println("Max=" +array[max]);
        System.out.println("Max index=" +max);
        double sum=0;
        int k=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]>0) {
                k = i;
                break;
            }
        }
        for (int i=k+1; i<array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summa=" +sum);
    }
}