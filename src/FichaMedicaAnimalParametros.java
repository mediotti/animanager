public class FichaMedicaAnimalParametros {
    Double temperatura;
    Integer frequenciaCardiaca;
    Integer frequenciaRespiratoria;
    String pressaoArterial;
    String observacoes;

    Leitura leitor = new Leitura();
    FichaMedicaAnimalParametros(){
        setFrequenciaCardiaca();
        setFrequenciaRespiratoria();
        setPressaoArterial();
        setTemperatura();
        setObservacoes();
    }
    public Double getTemperatura() {
        return temperatura;
    }

    private void setTemperatura() {
        temperatura = Double.parseDouble(leitor.input("Insira a temperatura do animal: "));
    }

    public Integer getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    private void setFrequenciaCardiaca() {
        frequenciaCardiaca = Integer.parseInt(leitor.input("Insira a frequencia cardiaca do animal: "));
        }

    public Integer getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }

    private void setFrequenciaRespiratoria() {
        frequenciaRespiratoria = Integer.parseInt(leitor.input("Insira a frequencia respiratória do animal: "));
    }

    public String getPressaoArterial() {
        return pressaoArterial;
    }

    private void setPressaoArterial() {
        pressaoArterial = leitor.input("Insira a pressão arterial do animal (e.g. 12x8): ");
    }

    public String getObservacoes() {
        return observacoes;
    }

    private void setObservacoes() {
        observacoes = leitor.input("Insira as observações, caso tenham: ");
    }
}
