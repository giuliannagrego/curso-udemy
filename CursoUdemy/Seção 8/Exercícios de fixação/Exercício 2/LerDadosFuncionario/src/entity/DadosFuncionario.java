package entity;

public class DadosFuncionario {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += grossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
