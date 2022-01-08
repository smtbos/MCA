class Main {
    public static void main(String[] args) {
        int a, b;
        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            System.out.println("Division = " + (a / b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please Pass 2 Arguments");
        } catch (ArithmeticException e) {
            System.out.println("Send Argument Can not be Zero");
        } catch (NumberFormatException e) {
            System.out.println("Pease Pass Numeric Arguments");
        } catch (Exception e) {
            System.out.println("Unable to Process.");
        } finally {
            System.out.println("Thank You, Bye!");
        }
    }
}