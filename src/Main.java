public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 70, 100, 300, 200};
        SalesManager salesManager = new SalesManager(arr);

        int max = salesManager.max();

        System.out.println(max);

        System.out.println(salesManager.getAverageSales());

    }
}
