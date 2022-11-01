//Nome: Gabriel Mediotti Marques
//RA: 2266377
public interface InterfaceFichaCadastral {
    public String getNomeFicha();
    public String getCPFFicha();
    public void setNomeFicha();
    public void setCPFFicha() throws CpfDiferente11AlgarismosException;
}
