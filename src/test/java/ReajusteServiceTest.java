import com.example.model.Desempenho;
import com.example.model.Funcionario;
import com.example.service.ReajusteService;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ReajusteServiceTest {
    
    ReajusteService service = new ReajusteService();
    Funcionario funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));

    @Before
    public void inicializarObjetos () {
        System.out.println("inicio");
        this.service = new ReajusteService(); 
        this.funcionario = new Funcionario("João", LocalDate.now(), new BigDecimal(1000));
    }

    @After
    public void finalizar(){
        System.out.println("fim");
    }

    @Test
    public void reajusteDeveriaSerDe3PorcentoQualdoDesempenhoForADesejar() {
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assert.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe15PorcentoQualdoDesempenhoForABom() {
        service.concederReajuste(funcionario, Desempenho.BOM);
        Assert.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe20PorcentoQualdoDesempenhoForAOtimo() {
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        Assert.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDe50PorcentoQualdoDesempenhoForAEspetacular() {
        service.concederReajuste(funcionario, Desempenho.ESPETACULAR);
        Assert.assertEquals(new BigDecimal("1500.00"), funcionario.getSalario());
    }
}
