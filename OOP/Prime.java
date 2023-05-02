import java.util.Scanner; 
class Prime {
    static int num;
    
    void is_prime(){
        if (num%2==0){
            System.out.println("It is prime number. ");
        } else if (num==1){
            System.out.println(("It is not prime number. "));
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        input.close();
    }
}