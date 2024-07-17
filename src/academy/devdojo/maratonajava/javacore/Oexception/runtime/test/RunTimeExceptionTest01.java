package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked Unchecked
        //Checked obrigatorio o tratamento
        //Unchecked não obrigatorio, entretanto quando o coddigo for compilado os erros RUNTIME
        //PODEM APARECER
        int[] nums = {1,2};
        System.out.println(nums[2]);
    }
}
