public class Main {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle( int numberOfRows){
        while(numberOfRows != 0){
            int printLeft = numberOfRows;
            while(printLeft != 0){
                System.out.print("*");
                --printLeft;
            }
            --numberOfRows;
            System.out.print("\n");
        }
    }
}