import com.example.model.Funcionario;
import com.example.service.BonusService;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class BonusServiceTest {
    
    @Test
    public void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("victor", LocalDate.now(), new BigDecimal(25000)));

        Assert.assertEquals(new BigDecimal("0.00"), bonus);
    }
    @Test
    public void bonusDeveriaSer10PocentoDoSalario(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("victor", LocalDate.now(), new BigDecimal(2500)));

        Assert.assertEquals(new BigDecimal("250.00"), bonus);
    }
    @Test
    public void bonusDeveriaSerDezPorcentoParaSalarioDeExatamenteDezMil(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("victor", LocalDate.now(), new BigDecimal(10000)));

        Assert.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
