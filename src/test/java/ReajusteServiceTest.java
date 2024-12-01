import com.example.model.Desempenho;
import com.example.model.Funcionario;
import com.example.service.ReajusteService;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Test;

public class ReajusteServiceTest {
    
    @Test
    public void reajusteDeveriaSerDe3PorcentoQualdoDesempenhoForADesejar() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        Assert.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe15PorcentoQualdoDesempenhoForABom() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(funcionario, Desempenho.BOM);

        Assert.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe20PorcentoQualdoDesempenhoForAOtimo() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(funcionario, Desempenho.OTIMO);

        Assert.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe50PorcentoQualdoDesempenhoForAEspetacular() {
        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));

        service.concederReajuste(funcionario, Desempenho.ESPETACULAR);

        Assert.assertEquals(new BigDecimal("1500.00"), funcionario.getSalario());
    }
}
