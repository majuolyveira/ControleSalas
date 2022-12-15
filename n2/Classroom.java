package n2;

/**
 * @author Lirio
 */
public class Classroom {

    private int number;
    private String type;
    private int block;
    private String id;
    private String status;
    private String responsible;

    /**
     * Cria uma nova sala de aula
     *
     * @param block o bloco onde esta sala está localizada
     * @param type o tipo de sala. Ex: Laboratório
     * @param number número da sala
     */
    public Classroom(int block, String type, int number) {
        this.block = block;
        this.type = type;
        this.number = number;
        this.id = "B" + block + "S" + number;
        this.status = "Disponível";
    }

    public String getId() {
        return id;
    }

    /**
     * Pegar o bloco em que esta sala está localizada
     *
     * @return número do bloco
     */
    public int getBlock() {
        return block;
    }

    /**
     * Define o bloco para essa sala
     * <p>
     * <strong>Atenção</strong>
     * <p>
     * Atualizar o bloco da sala gerará um novo identificador <code>id</code>
     *
     * @param block o número do bloco
     */
    public void setBlock(int block) {
        this.block = block;
        this.id = "B" + block + "S" + number;
    }

    /**
     * @return o tipo da sala
     */
    public String getType() {
        return type;
    }

    /**
     * Define o tipo de sala
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Pegar o status da sala
     * @return se disponível, ocupado ou reservado
     */
    public String getStatus() {
        return status;
    }

//    public void setStatus(String status) {
//        if (Status.isValid(status)) {
//            this.status = status;
//        }
//        assert (Status.isValid(status)) : "Status inválido!";
//    }
    /**
     * Define a sala como ocupada
     */
    public void setAsBusy() {
        this.status = "Ocupado";
    }

    /**
     * Define sala como disponível
     */
    public void setAsFree() {
        this.status = "Disponível";
    }

    /**
     * Define sala como reservada
     */
    public void setAsReserved() {
        this.status = "Reservada";
    }

    public String getResponsible() {
        return responsible;
    }

    /**
     * Define a pessoa responsável por essa sala
     *
     * @param responsible o nome do responsável
     */
    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public int getNumber() {
        return number;
    }

    /**
     * Define o número dessa sala
     * <p>
     * <strong>Atenção</strong>
     * <p>
     * Atualizar o número da sala gerará um novo identificador <code>id</code>
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
        this.id = "B" + block + "S" + number;
    }

    @Override
    public String toString() {
        return "\nTipo: " + type + "\nBloco: " + block + "\nNúmero: " + number
                + "\nResponsável: " + responsible + "\nStatus: " + status + "\nID: " + id;
    }

}
