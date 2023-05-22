package cucumberjava;

import io.cucumber.java.en.Given;
import java.util.List;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.exception.*;
import io.cucumber.java.*;
import com.dievi.entite.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDepotCalculTaxe {
	
	Depot dep=new Depot();
	Taxe tax;
	private  List<List<String>> board;
	private  List<List<String>> tableMontant;
	
	@Given("the amount is  {double}")
	public void the_amount_is(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		dep.setMontant(double1);
		
	}
	
	@When("i compute te tax of {double} %")
	public void i_compute_te_tax_of(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		tax=new Taxe(1, "0-100", double1, 100);
	    //throw new io.cucumber.java.PendingException();
	}
	@When("i select the tax in")
	public void i_select_the_tax_in(io.cucumber.datatable.DataTable dataTable) throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		this.board = dataTable.asLists();
		List zua=board.get(1);
		double impot=0.00;
		for(List baka:board) {
			System.out.println("baka.get(3)" +baka.get(3));
			String recup=""+baka.get(3);
			impot=Double.parseDouble(recup);
			System.out.println("impot" +impot);
			if (impot>=dep.getMontant()) {
				tax=new Taxe(baka);
				break;}
			
		}
		System.out.println(zua.get(1));
		//tax=dep.getTaxeToImpose(impot);
	}

	@Then("total to withdraw is {double}")
	public void total_to_withdraw_is(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    assertEquals(double1,dep.getMontantARetirer(tax),0);
	}
	@Then("total to withdraw  {double}")
	public void total_to_withdraw(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(double1,dep.getMontantARetirer(tax),0);
	}
	@Given("the amount is")
	public void the_amount_is(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   tableMontant= dataTable.asLists();
	}
	@Then("total to withdraw  <montant_a_retirer>")
	public void total_to_withdraw_montant_a_retirer(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}




}
