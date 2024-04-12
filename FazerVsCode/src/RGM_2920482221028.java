public class RGM_2920482221028 {
    private 
        String nome = "Audrey";
        String rgm = "2920482221028";
        Integer idade = 32;
        String gitHub = "@AudreyBergamine";
        String linkedin = "Audrey Bergamine";
        String curso = "Analise e Desenvolvimento de Sistemas";
        String turma = "4o Semestre";
        
        
    // CONSTRUTORES
    public RGM_2920482221028() {}


    public RGM_2920482221028(String nome, String rgm, Integer idade, String gitHub, String linkedin, String curso,
            String turma) {
        this.nome = nome;
        this.rgm = rgm;
        this.idade = idade;
        this.gitHub = gitHub;
        this.linkedin = linkedin;
        this.curso = curso;
        this.turma = turma;
    }


    // GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getRgm() {
        return rgm;
    }


    public void setRgm(String rgm) {
        this.rgm = rgm;
    }


    public Integer getIdade() {
        return idade;
    }


    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public String getGitHub() {
        return gitHub;
    }


    public void setGitHub(String gitHub) {
        this.gitHub = gitHub;
    }


    public String getLinkedin() {
        return linkedin;
    }


    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    public String getTurma() {
        return turma;
    }


    public void setTurma(String turma) {
        this.turma = turma;
    }


    @Override
    public String toString() {
        return "\n\n" + "Nome: " + nome +"\n"
                                + "RGM: " + rgm  +"\n"
                                + "Idade: " + idade  +"\n"
                                + "GitHub: " + gitHub +"\n"
                                + "Linkedin: " + linkedin  +"\n"
                                + "Curso: " + curso  +"\n"
                                + "Turma: " + turma;
    }

     

    
}
