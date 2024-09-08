package modelo;

public class Modelo {
 //ATRIBUTOS
 private Double moneda;
 private Double cantidad;
 private Double resultado;
 
 //METODOS
 public void setMoneda(Double moneda) {
  this.moneda = moneda;
 }
 public void setCantidad(Double cantidad) {
  this.cantidad = cantidad;
 }
 public Double getResultado() {
  return resultado;
 }
 public void convetirDolarAEuro() {
  resultado = cantidad * moneda;
 }
 public void convertirEuroADolar() {
  resultado = cantidad * moneda;
 }
 
}
