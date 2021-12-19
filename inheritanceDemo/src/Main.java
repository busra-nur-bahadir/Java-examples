public class Main {

    public static void main(String[] args) {
	// write your code here

        FarmerCreditManager farmerCreditManager = new FarmerCreditManager();
        BaseCreditManager baseCreditManager = new BaseCreditManager();

        CreditUI creditUI = new CreditUI();
        creditUI.Calculate(new TeacherCreditManager());
        creditUI.Calculate(farmerCreditManager);
        creditUI.Calculate(baseCreditManager);
    }
}
