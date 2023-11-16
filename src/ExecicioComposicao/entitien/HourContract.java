package ExecicioComposicao.entitien;

import java.util.Date;

public class HourContract {
    private Date data;
    private Double valurPerHour;
    private Integer hours;

    public HourContract(Date data, Double valurPerHour, Integer hours) {
        this.data = data;
        this.valurPerHour = valurPerHour;
        this.hours = hours;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValurPerHour() {
        return valurPerHour;
    }

    public void setValurPerHour(Double valurPerHour) {
        this.valurPerHour = valurPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public double totalValue (){
        return valurPerHour * hours;
    }
}
