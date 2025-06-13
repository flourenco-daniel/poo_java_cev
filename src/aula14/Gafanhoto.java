package aula14;

public class Gafanhoto extends Pessoa {

    private String login;
    private int totAssistido;

    public Gafanhoto(String login) {
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public int getTotAssistido(){
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido){
        this.totAssistido = totAssistido;
    }


    
}
