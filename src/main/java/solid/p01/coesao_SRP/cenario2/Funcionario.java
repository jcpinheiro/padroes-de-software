package solid.p01.coesao_SRP.cenario2;

import java.time.LocalDate;
import java.util.Calendar;

public class Funcionario {

    private int id;
    private String nome;
    private Cargo cargo;
    private LocalDate dataDeAdmissao;
    private double salarioBase;
    
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}