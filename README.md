# Guia4Puntos1y2y3



1) Construir una clase ArrayReales que declare una lista (elija la que corresponda) como atributo y que implemente una interfaz llamada Estadísticas. Realizar un main para comprobar funcionamiento implementando todos los métodos. 

public interface Estadisticas
 { 
double minimo(); 
double maximo(); 
double sumatorio(); 
} 

2) Construir una clase Matematicas  que declare una lista (elija la que corresponda) como atributo y que implemente una interfaz llamada Extremos.  Realizar un main para comprobar funcionamiento implementando todos los métodos. 

public interface Extremos 
{ 
double inicio(); 
double fin(); 
} 

NOTA: Investigar uso de Math.random() para cargar las listas de manera automática al construir las clases



















3) Construir una interfaz Relaciones que incluya los siguientes métodos

// Devuelve verdadero si a es mayor que b 
boolean esMayor(Object b) ;

 // Devuelve verdadero si a es menor que b 
boolean esMenor(Object b) ;

 // Devuelve verdadero si a es igual que b 
boolean esIgual(Object b) ;

Crear una clase Numero que tendrá un atributo entero e implementa dicha interfaz. Diseñar un Main que declare dos o más objetos del tipo Numero y usar los métodos correspondientes. Mostrar salida por pantalla. 
