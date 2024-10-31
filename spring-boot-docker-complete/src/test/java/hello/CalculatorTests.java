package hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

   @Test
    public void TestSuccessful() {
        // Тест на правильний результат
        Expression exp = new ExpressionBuilder("2 * 3 + 4").build();
        double result = exp.evaluate();
        assertEquals(10, result, "Результат має бути 10!");
    }

 /* @Test
    public void TestFailed() {
        // Тест на помилковий результат
        Expression exp = new ExpressionBuilder("0 * 14 - 0 * 4").build();
        double result = exp.evaluate();
        assertEquals(20, result, "Результат має бути 0!"); 
    }*/
}