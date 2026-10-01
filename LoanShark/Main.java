public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Interest Calculator!");
       Loan loan1 = new Loan(1000, 10, 1, 12); //Loan 1 information
       System.out.println("Loan 1: Simple Interest: $" + loan1.calculateSimpleInterest());
        System.out.println("Loan 1 Total Repayment: $" + loan1.calculateTotalRepayment());  
       Loan loan2 = new Loan(5000, 6.75, 12.5, 4); //Loan 2 information
       System.out.println("Loan 1: Simple Interest: $" + loan2.calculateSimpleInterest());
        System.out.println("Loan 1 Total Repayment: $" + loan2.calculateTotalRepayment());  

    }//main method
}//class