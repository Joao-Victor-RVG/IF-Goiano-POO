public class PessoaEspecial extends Pessoa {

    private int documentoID;

    public PessoaEspecial(String nome, Double telefone, Double endereco, int documentoID) {
        super(nome, telefone, endereco);
        this.documentoID = documentoID;
    }


    public int getDocumentoID() {
        return documentoID;
    }

    public void setDocumentoID(int documentoID) {
        this.documentoID = documentoID;
    }

}
