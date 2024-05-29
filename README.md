# Métodos numéricos -> Tema 1 al Tema 6

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> SALUDO </i> </b> </font> </h1>

¡Saludos a todos! Mi nombre es Rubí Veloz Jiménez y actualmente estoy cursando la carrera de Ingeniería en Sistemas Computacionales. Hoy, tengo el placer de compartir con ustedes un conjunto de problemas que he compilado, los cuales están estrechamente vinculados con la asignatura de Métodos Numéricos. Este problemario abarca de manera integral todos los temas que hemos estudiado en el curso. Espero que les sea de gran utilidad. ¡Vamos a ello!


<h2 align = "center"> <font color = "darkorange" size = "+6"  font face = "bauhaus 93">  INDICE </font> </h2>
<header> <font color = "red" size="+1" font face = "aharoni">
                <nav class="navegacion">
                    <ul class="Indice">

<li> <a href="#TEMA 1"> TEMA 1. </a> <br> </li>
                            <ul class="subindice"> 
                                <li> <a href="#Descripción del Problemario T1"> Descripción del Problemario. </a> <br> </li>
                                <li> <a href="#Sobre la materia T1"> Sobre la materia. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Competencia de la Asignatura T1"> Competencia de la Asignatura. </a> </li>
                                        <li> <a href="#Competencia del tema T1"> Competencia del tema. </a> </li>
                                        <li> <a href="#Temario T1"> Temario. </a> </li>  
                                    </ul>
                              <li> <a href="#Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora"> Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Overflow"> Overflow. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónO"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoO> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoO"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónO"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Redondeo"> Redondeo. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónR"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoR"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoR"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónR"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Truncamiento"> Truncamiento. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónT"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoT"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoT"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónT"> Implementación. </a> </li>  
                                            </ul>
                                    </ul>

                      
                        <li> <a href="#TEMA 2"> TEMA 2. </a> <br> </li>
                            <ul class="subindice"> 
  <li> <a href="#Descripción del ProblemarioT2"> Descripción del Problemario. </a> <br> </li>
                                <li> <a href="#SOBRE LA MATERIA T2"> SOBRE LA MATERIA. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Competencia de la Asignatura T2"> Competencia de la Asignatura. </a> </li>
                                        <li> <a href="#Competencia del TEMA T2"> Competencia del TEMA. </a> </li>
                                        <li> <a href="#TEMARIO T2"> TEMARIO. </a> </li>  
                                    </ul>
                              <li> <a href="#Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio"> Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Método de Bisección"> Método de Bisección. </a> </li>
                                        <li> <a href="#Método de la Falsa Posición"> Método de la Falsa Posición. </a> </li>
                                        <li> <a href="#Método de la Secante"> Método de la Secante. </a> </li> 
                                        <li> <a href="#Método de Newton-Raphson"> Método de Newton-Raphson. </a> </li> 
                                    </ul>
                            </ul>



                            <li> <a href="#TEMA 3"> TEMA 3. </a> <br> </li>
                                <ul class="subindice"> 
 <li> <a href="#Descripción del Problemario T3"> Descripción del Problemario. </a> <br> </li>
                                    <li> <a href="#Sobre la materia T3"> Sobre la materia. </a> <br> </li>
                                        <ul class="subindice"> 
                                            <li> <a href="#Competencia de la Asignatura T3"> Competencia de la Asignatura. </a> </li>
                                            <li> <a href="#Competencia del tema T3"> Competencia del tema. </a> </li>
                                            <li> <a href="#Temario T3"> Temario. </a> </li>  
                                        </ul>
                                  <li> <a href="#Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio."> Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio. </a> <br> </li>
                                        <ul class="subindice"> 
                                            <li> <a href="#Eliminación Gaussiana"> Eliminación Gaussiana. </a> </li>
                                                <ul class="subindice"> 
                                                    <li> <a href="#DescripciónEG"> Descripción. </a> </li>
                                                    <li> <a href="#AlgoritmoEG"> Algoritmo. </a> </li>
                                                    <li> <a href="#ImplementaciónEG"> Implementación. </a> </li>  
                                                </ul>
                                            <li> <a href="#Método de Gauss-Jordan"> Método de Gauss-Jordan. </a> </li>
                                                  <ul class="subindice"> 
                                                      <li> <a href="#DescripciónGJ"> Descripción. </a> </li>
                                                      <li> <a href="#AlgoritmoGJ"> Algoritmo. </a> </li>
                                                      <li> <a href="#ImplementaciónGJ"> Implementación. </a> </li>  
                                                  </ul>
                                            <li> <a href="#Método de Gauss-Seidel"> Método de Gauss-Seidel. </a> </li> 
                                                  <ul class="subindice"> 
                                                      <li> <a href="#DescripciónGS"> Descripción. </a> </li>
                                                      <li> <a href="#AlgoritmoGS"> Algoritmo. </a> </li>
                                                      <li> <a href="#ImplementaciónGS"> Implementación. </a> </li>  
                                                  </ul>
                                            <li> <a href="#Método de Jacobi"> Método de Jacobi. </a> </li> 
                                                  <ul class="subindice"> 
                                                      <li> <a href="#DescripciónJ"> Descripción. </a> </li>
                                                      <li> <a href="#AlgoritmoJ"> Algoritmo. </a> </li>
                                                      <li> <a href="#ImplementaciónJ"> Implementación. </a> </li>  
                                                  </ul>
                                          <li> <a href="#Evidencia de trabajo en equipo"> Evidencia de trabajo en equipo. </a> </li>   
                                    </ul>
                            </ul>





                            <li> <a href="#TEMA 4"> TEMA 4. </a> <br> </li>
                              <ul class="subindice"> 
<li> <a href="#Descripción del Problemario T4"> Descripción del Problemario. </a> <br> </li>
                                  <li> <a href="#Sobre la materia T4"> Sobre la materia. </a> <br> </li>
                                      <ul class="subindice"> 
                                          <li> <a href="#Competencia de la Asignatura T4"> Competencia de la Asignatura. </a> </li>
                                          <li> <a href="#Competencia del tema T4"> Competencia del tema. </a> </li>
                                          <li> <a href="#Temario T4"> Temario. </a> </li>  
                                      </ul>
                                <li> <a href="#Métodos Numéricos sobre los métodos de solución de sistemas de problemas aplicando diferenciación y integración que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de solución de sistemas de problemas aplicando diferenciación y integración que se encuentran en nuestro repositorio. </a> <br> </li>
                                      <ul class="subindice"> 
                                          <li> <a href="#Método del Trapecio"> Método del Trapecio. </a> </li>
                                              <ul class="subindice"> 
                                                  <li> <a href="#DescripciónT"> Descripción. </a> </li>
                                                  <li> <a href="#AlgoritmoT"> Algoritmo. </a> </li> 
                                                  <li> <a href="#Representación gráficaT"> Representación gráfica. </a> </li>
                                                  <li> <a href="#ImplementaciónT"> Implementación. </a> </li>  
                                              </ul>
                                          <li> <a href="#Método de la Regla de Simpson 1/3"> Método de la Regla de Simpson 1/3. </a> </li>
                                                <ul class="subindice"> 
                                                    <li> <a href="#Descripción1/3"> Descripción. </a> </li>
                                                    <li> <a href="#Algoritmo1/3"> Algoritmo. </a> </li>
                                                    <li> <a href="#Representación gráfica1/3"> Representación gráfica. </a> </li>
                                                    <li> <a href="#Implementación1/3"> Implementación. </a> </li>  
                                                </ul>
                                          <li> <a href="#Método de la Regla de Simpson 3/8"> Método de la Regla de Simpson 3/8. </a> </li> 
                                                <ul class="subindice"> 
                                                    <li> <a href="#Descripción3/8"> Descripción. </a> </li>
                                                    <li> <a href="#Algoritmo3/8"> Algoritmo. </a> </li>
                                                    <li> <a href="#Representación gráfica3/8"> Representación gráfica. </a> </li>
                                                    <li> <a href="#Implementación3/8"> Implementación. </a> </li>  
                                                </ul>
                                          <li> <a href="#Método de la Cuadratura Gaussiana"> Método de la Cuadratura Gaussiana. </a> </li> 
                                                <ul class="subindice"> 
                                                    <li> <a href="#DescripciónCG"> Descripción. </a> </li>
                                                    <li> <a href="#AlgoritmoCG"> Algoritmo. </a> </li>
                                                    <li> <a href="#Representación gráficaCG"> Representación gráfica. </a> </li>
                                                    <li> <a href="#ImplementaciónCG"> Implementación. </a> </li>  
                                                </ul>
                              </ul>




                        <li> <a href="#TEMA 5"> TEMA 5. </a> <br> </li>
                            <ul class="subindice"> 
   <li> <a href="#Descripción del Problemario T5"> Descripción del Problemario. </a> <br> </li>
                                <li> <a href="#Sobre la materia T5"> Sobre la materia. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Competencia de la Asignatura T5"> Competencia de la Asignatura. </a> </li>
                                        <li> <a href="#Competencia del tema T5"> Competencia del tema. </a> </li>
                                        <li> <a href="#Temario T5"> Temario. </a> </li>  
                                    </ul>
                              <li> <a href="#Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio. </a> <br> </li>
                                    <ul class="subindice"> 
                                        <li> <a href="#Método interpolación lineal"> Método interpolación lineal. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónIL"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoIL"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoIL"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónIL"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Método interpolación cuadrática"> Método interpolación cuadrática. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónIC"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoIC"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoIC"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónIC"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Método interpolación de Lagrange"> Método interpolación de Lagrange. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónILa"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoILa"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoILa"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónILa"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Método interpolación de Newton"> Método interpolación de Newton. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónIN"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoIN"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoIN"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónIN"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Método de correlación"> Método de correlación. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónC"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoC"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoC"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónC"> Implementación. </a> </li>  
                                            </ul>
                                        <li> <a href="#Método de regreción"> Método de regreción. </a> </li>
                                            <ul class="subindice"> 
                                                <li> <a href="#DescripciónR"> Descripción. </a> </li>
                                                <li> <a href="#AlgoritmoR"> Algoritmo. </a> </li> 
                                                <li> <a href="#PseudocódigoR"> Pseudocódigo. </a> </li>
                                                <li> <a href="#ImplementaciónR"> Implementación. </a> </li>  
                                            </ul>
                                    </ul>
                            </ul>


                      
                    </ul>
                </nav>
            </font> </header>

--------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 1"> TEMA 1 </a>  </i> </b> </font> </h1>

# <h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T1"> Descripción del Problemario </a> </font> </h2>


1. **Overflow**:
   - Se refiere a una situación en la que un cálculo produce un resultado que es mayor de lo que una computadora puede representar en su sistema de numeración.
   - Puede ocurrir, por ejemplo, al realizar una división por un número próximo a 0.
   - Es importante tener en cuenta este fenómeno al diseñar algoritmos y sistemas numéricos para evitar errores de cálculo.

2. **Redondeo**:
   - Es un proceso en el que un número se aproxima a otro número.
   - Redondear significa simplificar un número pero mantener su valor cerca de lo que era.
   - Los errores de redondeo pueden surgir al representar números con un número finito de decimales en las máquinas de cálculo.
   - Existen diferentes métodos de redondeo y cada uno tiene sus propias reglas y ejemplos.

3. **Truncamiento**:
   - Se refiere a la eliminación de los dígitos menos significativos de un número.
   - Los errores de truncamiento surgen al obtener una aproximación numérica de la solución exacta.
   - Estos errores son inevitables y previsibles en los cálculos numéricos.
   - Es crucial considerar estos errores al seleccionar un método numérico para resolver un problema.

********************************************************************************************************************************************************************************************************************

# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T1"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T1"> Competencia de la Asignatura </a> </h3>

     Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Competencia del tema T1"> Competencia del tema </a> </h3>

    Aplica los tipos de errores para identificar la incertidumbre y limitaciones de los cálculos numéricos en una computadora.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Temario T1"> Temario  </a> </h3>

    1. Introducción a los métodos numéricos 
         1.1 Importancia de los métodos numéricos. 
         1.2 Conceptos básicos: cifra significativa, precisión, exactitud, incertidumbre y sesgo. 
         1.3 Tipos de errores. 
         1.4 Software de cómputo numérico. 
        1.5 Métodos iterativos.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora"> Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora. </a> </font> </h2>


# <h3 align = "center"> <font font face = "forte"> <a name="Overflow"> 1. Overflow </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónO"> Descripción. </a> </h4>

El **Overflow** es un fenómeno que ocurre en la computación cuando un cálculo produce un resultado que excede el límite máximo que una computadora puede representar en su sistema de numeración. Este fenómeno puede ocurrir, por ejemplo, al realizar una división por un número muy cercano a 0. Es crucial tener en cuenta este fenómeno al diseñar algoritmos y sistemas numéricos para evitar errores de cálculo.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoO"> Algoritmo. </a> </h4>

1. **Identificar los límites de los números**: En cualquier sistema de numeración, hay un límite superior e inferior para los números que se pueden representar.

2. **Realizar el cálculo**: Ejecuta la operación matemática o el algoritmo que estás utilizando.

3. **Verificar si el resultado está dentro de los límites**: Comprueba si el resultado del cálculo está dentro de los límites del sistema de numeración.

4. **Manejar el overflow**: Si el resultado excede los límites, entonces ha ocurrido un overflow. En este caso, debes manejar el error de acuerdo con las necesidades de tu aplicación.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoO"> Pseudocódigo. </a> </h4>

    Función Verificar_Overflow(limite_inferior, limite_superior, resultado):
        Si resultado > limite_superior o resultado < limite_inferior:
            Levantar un error de Overflow
        De lo contrario:
            Devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónO"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Overflow;

    public class Ejercicio2 {
        public static void main(String[] args) {
            // Ejemplo de desbordamiento en multiplicación con enteros
            int a = Integer.MAX_VALUE; // Valor máximo para un entero
            int b = 2; // Multiplicación por 2
    
            // Intentamos multiplicar el valor máximo de un entero por 2
            int producto = a * b;
    
            // Imprimimos el resultado
            System.out.println("Resultado de la multiplicación: " + producto); // Se produce un desbordamiento
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 141302](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/a850ac71-8c38-435a-b28e-d7ed0a668a13)




Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Overflow"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Overflow </font> </a>









# <h3 align = "center"> <font font face = "forte"> <a name="Redondeo"> 2. Redondeo </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónR"> Descripción. </a> </h4>

El **Redondeo** es una operación matemática que se utiliza para aproximar un número a otro número más simple o más fácil de trabajar⁶. Es una técnica comúnmente utilizada en muchos campos, como la contabilidad, la estadística, la programación y el diseño de páginas web⁶. El redondeo puede ser hacia arriba o hacia abajo dependiendo del valor del número. Por ejemplo, los valores como 3.1, 3.3 ó 3.4 se redondean a la baja a 3, mientras que valores tales como 3.6, 3.8 ó 3.9 se redondean al alza a 4¹.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Identificar el número a redondear**: Este es el número que deseas simplificar.

2. **Determinar el número de decimales a mantener**: Decide cuántos decimales quieres mantener después del redondeo.

3. **Verificar el siguiente decimal**: Comprueba si el decimal siguiente al último decimal que quieres mantener es mayor o igual a 5.

4. **Realizar el redondeo**: Si el decimal es mayor o igual a 5, incrementa en 1 el último decimal que quieres mantener. Si es menor que 5, deja el último decimal como está.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>

    Función Redondear(número, decimales):
        factor = 10 ^ decimales
        resultado = Redondear(número * factor) / factor
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónR"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Redondeo;
    
    public class Ejercicio1 {
        public static void main(String[] args) {
            // Ejemplo de error de redondeo en suma
            double num1 = 0.1;
            double num2 = 0.2;
            double suma = num1 + num2;
    
            System.out.println("Suma: " + suma); // Imprime 0.30000000000000004
    
            // Ejemplo de error de redondeo en multiplicación
            double num3 = 1.0 / 3.0;
            double resultado = num3 * 3;
    
            System.out.println("Resultado: " + resultado); // Imprime 0.9999999999999999
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 141937](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/a8872e7a-b88b-4e5c-858e-1e65d5b62fbc)





Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Redondeo"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Redondeo </font> </a>








# <h3 align = "center"> <font font face = "forte"> <a name="Truncamiento"> 3. Truncamiento </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónT"> Descripción. </a> </h4>

El **Redondeo** es una operación matemática que se utiliza para aproximar un número a otro número más simple o más fácil de trabajar⁶. Es una técnica comúnmente utilizada en muchos campos, como la contabilidad, la estadística, la programación y el diseño de páginas web⁶. El redondeo puede ser hacia arriba o hacia abajo dependiendo del valor del número. Por ejemplo, los valores como 3.1, 3.3 ó 3.4 se redondean a la baja a 3, mientras que valores tales como 3.6, 3.8 ó 3.9 se redondean al alza a 4¹.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Identificar el número a redondear**: Este es el número que deseas simplificar.

2. **Determinar el número de decimales a mantener**: Decide cuántos decimales quieres mantener después del redondeo.

3. **Verificar el siguiente decimal**: Comprueba si el decimal siguiente al último decimal que quieres mantener es mayor o igual a 5.

4. **Realizar el redondeo**: Si el decimal es mayor o igual a 5, incrementa en 1 el último decimal que quieres mantener. Si es menor que 5, deja el último decimal como está.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>

    Función Redondear(número, decimales):
        factor = 10 ^ decimales
        resultado = Redondear(número * factor) / factor
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónT"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Truncamiento;
    
    import java.util.function.DoubleUnaryOperator;
    
    public class Ejercicio4 {
        public static void main(String[] args) {
            // Definimos la función f(x) = x^3
            DoubleUnaryOperator funcion = x -> x * x * x;
    
            // Punto en el que aproximamos la derivada
            double punto = 2.0;
    
            // Tamaño del paso para las diferencias finitas
            double h = 0.01;
    
            // Aproximación de la derivada mediante diferencias finitas hacia adelante
            double derivadaAproximada = diferenciaFinitaAdelante(funcion, punto, h);
    
            // Valor verdadero de la derivada de f(x) = x^3 en x = 2
            double valorVerdadero = 3 * punto * punto;
    
            // Calculamos el error de truncamiento
            double errorTruncamiento = Math.abs(derivadaAproximada - valorVerdadero);
    
            // Imprimimos resultados
            System.out.println("Aproximación de la derivada: " + derivadaAproximada);
            System.out.println("Valor verdadero de la derivada: " + valorVerdadero);
            System.out.println("Error de truncamiento: " + errorTruncamiento);
        }
    
        // Método para calcular la derivada mediante diferencias finitas hacia adelante
        public static double diferenciaFinitaAdelante(DoubleUnaryOperator funcion, double x, double h) {
            return (funcion.applyAsDouble(x + h) - funcion.applyAsDouble(x)) / h;
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 142455](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/f1a2b0af-9e7c-4f84-a7c9-010a13a73e43)






Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Truncamiento"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema6/tree/master/Tema1/Truncamiento </font> </a>


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 2"> TEMA 2 </a>  </i> </b> </font> </h1>

<h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T2"> Descripción del Problemario Tema 2 </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos para determinar las raíces de funciones. Estos métodos son:

  1. Método de Bisección: Un enfoque sencillo pero efectivo para encontrar raíces en intervalos.
  2. Método de la Falsa Posición: Una técnica que combina la bisección con interpolación lineal.
  3. Método de la Secante: Un algoritmo iterativo que no requiere el cálculo de derivadas.
  4. Método de Newton-Raphson: Un método basado en la aproximación de la derivada.

Cada uno de estos métodos se encuentra organizado en carpetas específicas. Al ingresar a la carpeta correspondiente de cada método, encontrarás cinco ejercicios resueltos en el lenguaje de programación Java. Además, dentro de cada carpeta, proporcionamos una breve descripción y detalles importantes sobre la aplicación de cada método.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="SOBRE LA MATERIAT2"> SOBRE LA MATERIA </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T2"> Competencia de la Asignatura </a> </h3>

    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

<h3> <font font face = "forte"> <a name="Competencia del TEMA T2"> Competencia del TEMA </a> </h3>

    Aplica los métodos numéricos con el objeto de solucionar ecuaciones mediante los métodos de intervalo e interpolación apoyada de un lenguaje de programación.  

<h3> <font font face = "forte"> <a name="TEMARIO T2"> TEMARIO  </a> </h3>

   2.1 Métodos de intervalo. 
   
   2.2 Método de bisección.
   
   2.3 Método de aproximaciones sucesivas. 
   
   2.4 Métodos de interpolación. 
   
   2.5 Aplicaciones.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio"> Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio </a> </font> </h2>

<h3 align = "center"> <font font face = "forte"> <a name="Método de Bisección"> 1. Método de Bisección </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

El método de bisección, conocido también como de corte binario, de partición de intervalos o de Bolzano, es un tipo de búsqueda incremental en el que el intervalo se divide siempre a la mitad. Si la función cambia de signo sobre un intervalo, se evalúa el valor de la función en el punto medio. La posición de la raíz se determina situándola en el punto medio del subintervalo, dentro del cual ocurre un cambio de signo. El proceso se repite hasta obtener una mejor aproximación.


<h4> <font font face = "arial"> ALGORITMO: </h4>
Paso 1: Elija valores iniciales inferior, xl, y superior, xu, que encierren la raíz, de tal forma que la función cambie de signo en el intervalo. Esto se verifica comprobando
que f(xl) f(xu) < 0.

Paso 2: Una aproximación de la raíz xr se determina mediante:
Xr = (Xl + Xu) / 2

Paso 3: Realice las siguientes evaluaciones para determinar en qué subintervalo está la raíz: 

    a) Si f(xl)f(xr) < 0, entonces la raíz se encuentra dentro del subintervalo inferior o izquierdo. Por lo tanto, haga xu = xr y vuelva al paso 2. 
    b) Si f(xl)f(xr) > 0, entonces la raíz se encuentra dentro del subintervalo superioro derecho. Por lo tanto, haga xl = xr y vuelva al paso 2. 
    c) Si f(xl)f(xr) = 0, la raíz es igual a xr; termina el cálculo.

   
   <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 18 18_c66bb2e7](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/bded96b1-64f6-4520-9fc0-b2dd1b794379)


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: x^3+4x^2-10      
Limites -> A:1 B:2      
Iteraciones: 10        
Error: 0.0001

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package biseccion1;
    
    import java.util.Scanner;
    
    public class Biseccion1 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\t\t\t\t -- Método de bisección (EJERCICIO 1) --");
    
            System.out.print("Ingrese el límite inferior: ");
            double a = scanner.nextDouble();
    
            System.out.print("Ingrese el límite superior: ");
            double b = scanner.nextDouble();
    
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt();
    
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble();
    
            // Encontrar la raíz de la función usando el método de bisección
            double root = bisectionMethod(a, b, maxIter, tol);
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root);
        }
    
        // Definir el método de bisección
        public static double bisectionMethod(double a, double b, int maxIter, double tol) {
            // Verificar si la función cambia de signo en el intervalo
            if ((func(a) * func(b)) > 0) {
                System.out.println("El método no puede encontrar una raíz en el intervalo.");
                return -1;
            }
    
            double c;
            // Iterar hasta que se alcance el número máximo de iteraciones
            for (int i = 0; i < maxIter; i++) {
                // Calcular el punto medio del intervalo
                c = (a + b) / 2;
                // Verificar si el punto medio está dentro de la tolerancia
                if (Math.abs(func(c)) < tol) {
                    // Devolver el punto medio como la raíz
                    return c;
                }
                // Actualizar el intervalo
                if (func(a) * func(c) < 0) {
                    b = c;
                } else {
                    a = c;
                }
            }
            // Devolver el punto medio del intervalo final como la raíz
            return (a + b) / 2;
        }
    
        // Definir la función para encontrar la raíz de
        public static double func(double x) {
            return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
        }
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![Imagen de WhatsApp 2024-02-29 a las 21 23 35_14f59d0b](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/381b92ed-11ff-4282-9758-cc91cb53dd78)


<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>

  ![Captura de pantalla 2024-02-29 222857](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/035fc501-0729-4ff8-9c91-900f354df65a)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="#[INDICE](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20bisecci%C3%B3n)"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20bisecci%C3%B3n </font> </a>



<h3 align = "center"> <font font face = "forte"> <a name="Método de la Falsa Posición"> 2. Método de la Falsa Posición </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

Aun cuando la bisección es una técnica perfectamente válida para determinar raíces, su método de aproximación por “fuerza bruta” es relativamente ineficiente. La falsa posición es una alternativa basada en una visualización gráfica.


<h4> <font font face = "arial"> ALGORITMO: </h4>
1. Seleccionar los valores iniciales de a y b y evaluar en este intervalo, de manera que la función cambie de signo, establecer una tolerancia de error.

2. La primera aproximación se calcula con la siguiente ecuación: Xr = b - f(b)(a-b) / f(a)-f(b)

3. Realizar las siguientes evaluaciones:

    - Si f(a) * f(Xr) = 0 : se terminan los cálculos
    
    - Si f(a) * f(Xr) > 0 : la raíz se encuentra entre Xr y b. Hacer a = Xr.
    
    - Si f(a) * f(Xr) < 0 : la raíz se encuentra entre Xr y a. Hacer b = Xr.

4. Calcular el nuevo Xr.

5. Calcular el error aproximado para ver si se cumple el criterio establecido.


   
<h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 19 49_a0a34287](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/9167c198-e4b2-45a3-a2df-138f31b95052)


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 10x^(3)+2x^(2)-9x-8   
Limites -> A:1 B:2      
Iteraciones: 10        
Error: 0.0001

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package falsaposicion4;
    
    import java.util.Scanner;
    
    public class FalsaPosicion4 {
    
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
    
           System.out.println("\t\t\t\t -- Método de la falsa posición (EJERCICIO 4) --");
    
           System.out.print("Ingrese el límite inferior: ");
           double a = scanner.nextDouble();
    
           System.out.print("Ingrese el límite superior: ");
           double b = scanner.nextDouble();
    
           System.out.print("Ingrese el número máximo de iteraciones: ");
           int maxIter = scanner.nextInt();
    
           System.out.print("Ingrese el valor de tolerancia: ");
           double tol = scanner.nextDouble();
    
           // Se calcula la raíz de la ecuación utilizando el método de la posición falsa
           double root = falsePositionMethod(a, b, maxIter, tol);
    
           // Se imprime el resultado en formato decimal con 5 cifras después del punto decimal
           System.out.printf("La raíz de la ecuación es: %.5f%n", root);
        }
    
        // Método que implementa el algoritmo de la posición falsa
        public static double falsePositionMethod(double a, double b, int maxIter, double tol) {
           // Se verifica si la función cambia de signo en el intervalo [a, b]
           if (func(a) * func(b) > 0) {
               // Si no cambia de signo, se imprime un mensaje indicando que la función no encuentra la raiz en el intervalo dado 
               System.out.println("El método no puede encontrar una raíz en el intervalo.");
               return -1;
            }
    
            double xa, xb, xr = 0;
            xa = a;
            xb = b;
    
            for (int i = 0; i < maxIter; i++) {
                xr = xb - (func(xb) * (xb - xa) / (func(xb) - func(xa)));
                if (Math.abs(func(xr)) < tol) {
                    // Si la diferencia absoluta de la función en x2 es menor que la tolerancia, se devuelve x2 como la raíz
                    return xr;
                }
                if (func(xa) * func(xr) < 0) {
                    // Si la función cambia de signo entre x0 y x2, se actualiza x1
                    xb = xr;
                } else {
                    // De lo contrario, se actualiza x0
                    xa = xr;
                }
            }
            // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, se devuelve el último valor de x2 como la raíz aproximada
            return xr;
        }
    
        // Método que define la función cuya raíz se desea encontrar
        public static double func(double x) {
           return 10 * Math.pow(x, 3) + 2 * Math.pow(x, 2) - 9 * x - 8;
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![Imagen de WhatsApp 2024-02-29 a las 21 23 35_14f59d0b](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/3f97ba75-643d-4d6c-b0de-0c91d9e27208)



<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
![Captura de pantalla 2024-02-29 222857](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/ff4d59e5-87b9-4cce-b9eb-a180f6f37302)


   
Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="#[[INDICE](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20bisecci%C3%B3n)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20falsa%20posici%C3%B3n)"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20falsa%20posici%C3%B3n </font> </a>




<h3 align = "center"> <font font face = "forte"> <a name="Método de la Secante"> 3. Método de la Secante. </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

Un problema potencial en la implementación del método de Newton-Raphson es la evaluación de la derivada. Aunque esto no es un inconveniente para los polinomios ni para muchas otras funciones, existen algunas funciones cuyas derivadas en ocasiones resultan muy difíciles de calcular.
Esta técnica es similar a la del método de Newton-Raphson en el sentido de que una aproximación de la raíz se predice extrapolando una tangente de la función hasta el eje x. Sin embargo, el método de la secante usa una diferencia dividida en lugar de una derivada para estimar la pendiente.



<h4> <font font face = "arial"> ALGORITMO: </h4>

1. Definición del problema:
    - Supongamos que tenemos una función (f(x)) que es continua en un intervalo ([a, b]).
    - Además, (f(a)) y (f(b)) tienen signos opuestos (es decir, (f(a) \cdot f(b) < 0)).

2. Cálculo de la aproximación inicial:
    - Tomamos dos aproximaciones iniciales: (x_0) y (x_1).
    - La siguiente aproximación, (x_2), se calcula mediante la fórmula: x_2 = x_1 - (f(x_1) (x_1 - x_0)) / (f(x_1) - f(x_0))

3. Iteración:
    -Repetimos el proceso:
    --Calculamos (x_3) usando (x_1) y (x_2).
    --Calculamos (x_4) usando (x_2) y (x_3).
    --Continuamos hasta alcanzar la precisión deseada.

4.Convergencia:
  -El método de la secante tiene una convergencia superlineal inferior al método de Newton-Raphson.



   
   <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 23 41_62839bca](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/0326197f-06b9-42ae-837c-d9d5f1f6d232)


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 4x^(4)-16    
Limites -> Aproximación1: 2   
Aproximación2: 1        
Iteraciones: 10        
Error: 0.0001


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package msecante2;
    
    import java.util.Scanner;
    
    public class MSecante2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("\t\t\t\t -- Método de la secante (EJERCICIO 2) --"); 
            
            System.out.print("Ingrese Ingrese la primera aproximación: ");
            double x0 = scanner.nextDouble(); 
            
            System.out.print("Ingrese la segunda aproximación: ");
            double x1 = scanner.nextDouble(); 
            
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt(); 
            
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble(); 
    
            // Se calcula la raíz de la ecuación utilizando el método de la secante
            double root = secantMethod(x0, x1, maxIter, tol); 
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
        }
    
        public static double secantMethod(double x0, double x1, int maxIter, double tol) {
            if (func(x0) * func(x1) == 0) {
                System.out.println("El método no puede encontrar una raíz en el intervalo."); // Mensaje que se muestra si la raiz no esta dentro de las 2 aproximaciones
                return -1;
            }
    
            double x2 = 0;
            for (int i = 0; i < maxIter; i++) {
                x2 = x1 - (func(x1) * (x1 - x0) / (func(x1) - func(x0))); // Calcula la raiz siguendo la formula del método de la secante 
                if (Math.abs(x1 - x2) < tol) {
                    return x2; // Si el cambio en las aproximaciones es menor que el valor de tolerancia, devolver la aproximación actual como la raíz
                }
                x0 = x1; // Actualizar el valor de x0
                x1 = x2; // Actualizar el valor de x1
            }
            return x2; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devolver la última aproximación
        }
    
        public static double func(double x) {
            return 4 * Math.pow(x, 4) - 16; // Definir la función cuya raíz se desea encontrar
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![secantePro](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/2f0a1932-df69-44f4-9372-1d96e5a8fb24)




<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
  ![Captura secante](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/c15e9096-ce5d-4661-954c-e61b4e67d089)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="#[[[INDICE](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20bisecci%C3%B3n)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20falsa%20posici%C3%B3n)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20secante)"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20secante </font> </a>




<h3 align = "center"> <font font face = "forte"> <a name="Método de Newton-Raphson"> 4. Método de Newton-Raphson. </a> </h3>
   
<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

El método de Newton-Raphson se utilizó empleando la derivada (al evaluar, es la pendiente de la recta tangente) de una función, para calcular su intersección con el eje de la variable independiente; esto es, la raíz.



<h4> <font font face = "arial"> ALGORITMO: </h4>

1. Escoge un valor inicial para (x). Este valor es una estimación donde esperamos encontrar una raíz.

2. Evalúa la función usando el valor de (x) del paso 1.

3. Calcula la derivada de la función utilizando el valor de (x) del paso 1.

4. Actualiza la estimación de la raíz mediante la siguiente fórmula: x(r+1) = xr - (f(xr)/f’(xr))

5. Repite los pasos 2-4 hasta que la estimación de la raíz converja a un valor preciso.




   
    <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
![Captura de pantalla 2024-02-28 222609](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/0ab55093-032e-4ea5-8a94-7f196b8e4658)


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 15x^(2)+5 x-3    
Derivada de la Función: 30x+5       
Aproximación inicial: 0       
Iteraciones: 10        
Error: 0.0001


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package mnewton3;
    
    import java.util.Scanner;

    public class MNewton3 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("\t\t\t\t -- Método de Newton (EJERCICIO 3) --"); 
            
            System.out.print("Ingrese la aproximación inicial: ");
            double x0 = scanner.nextDouble(); 
    
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt(); 
    
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble(); 
    
            // Se calcula la raíz de la ecuación utilizando el método de Newton
            double root = newtonMethod(x0, maxIter, tol); 
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
        }
    
        public static double newtonMethod(double x0, int maxIter, double tol) {
            double fx = func(x0); // Calcula el valor de la función en x0
            double df = funcDerivada(x0); // Calcula el valor de la derivada de la función en x0
    
            if (df == 0) {
                System.out.println("El método no puede encontrar una raíz en la aproximacion."); // Mensaje que se muestra si la derivada en la conjetura inicial no tiene una raiz
                return -1;
            }
    
            double x1 = 0;
            for (int i = 0; i < maxIter; i++) {
                x1 = x0 - (fx / df); // Actualiza la aproximación utilizando la fórmula del método de Newton
                double error = Math.abs(x1 - x0); // Calcula el error relativo
                if (error < tol) {
                    return x1; // Si el error es menor que el valor de tolerancia, devuelve la aproximación actual como la raíz
                }
                x0 = x1; // Actualiza la aproximación para la iteración siguiente
                fx = func(x0); // Calcula el valor de la función en la nueva aproximación
                df = funcDerivada(x0); // Calcula el valor de la derivada de la función en la nueva aproximación
            }
            return x1; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devuelve la última aproximación
        }
    
        public static double func(double x) {
            return 15 * Math.pow(x, 2) + 5 * x - 3 ; // Definir la función cuya raíz se desea encontrar
        }
    
        public static double funcDerivada(double x) {
            return 30 * x + 5;  //Definir la derivada de la función
        }
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![newtonPto](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/fd08d1b1-81f7-42f1-bb90-63378f45ccc9)





<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
  ![Captura newton](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/6668835b-f928-4b66-9665-b42f00146e1c)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="#[[[[INDICE](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20bisecci%C3%B3n)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20falsa%20posici%C3%B3n)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20la%20secante)](https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20Newton%20Raphson)"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos/tree/main/M%C3%A9todo%20de%20Newton%20Raphson </font> </a>





---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 3"> TEMA 3 </a>  </i> </b> </font> </h1>

<h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T3"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos la solución de sistemas de ecuaciones lineales. Estos métodos son:

1. **Eliminación Gaussiana**:
   - Método para resolver sistemas de ecuaciones lineales.
   - Transforma la matriz ampliada en forma escalonada.
   - Luego, se resuelve sustituyendo hacia atrás.
   - Clasifica el sistema como compatible determinado, indeterminado o incompatible.

2. **Método de Gauss-Jordan**:
   - Variante de la eliminación de Gauss.
   - Llega a la forma escalonada reducida.
   - Proporciona directamente las soluciones del sistema.

3. **Método de Gauss-Seidel**:
   - Resuelve sistemas iterativamente.
   - Actualiza las incógnitas en cada iteración.
   - Adecuado para matrices simétricas y dominantes.

4. **Método de Jacobi**:
   - Otra técnica iterativa para sistemas lineales.
   - Actualiza las incógnitas con valores iniciales.
   - Adecuado para matrices diagonales dominantes.

Cada uno de estos métodos se encuentra organizado en carpetas específicas. Al ingresar a la carpeta correspondiente de cada método, encontrarás cinco ejercicios resueltos en el lenguaje de programación Java. 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T3"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T3"> Competencia de la Asignatura </a> </h3>

    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

<h3> <font font face = "forte"> <a name="Competencia del tema T3"> Competencia del tema </a> </h3>

''

<h3> <font font face = "forte"> <a name="Temario T3"> Temario  </a> </h3>

''

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio </a> </font> </h2>

<h3 align = "center"> <font font face = "forte"> <a name="Eliminación Gaussiana"> 1. Eliminación Gaussiana </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónEG"> Descripción: </a> </h4>

   - También conocido como **método de eliminación de Gauss**, este algoritmo se utiliza para resolver sistemas de ecuaciones lineales. Aquí están los pasos clave:
   - Se trabaja con la **matriz ampliada** del sistema (que incluye los coeficientes de las incógnitas y los términos independientes).
   - Mediante operaciones de fila (intercambio, suma y multiplicación), se transforma la matriz ampliada en una **forma escalonada** (matriz triangular superior).
   - Luego, se resuelve el sistema sustituyendo hacia atrás desde la última fila.
   - Si se llega a la **forma escalonada reducida**, se denomina **eliminación de Gauss-Jordan**.
   - La clasificación del sistema (compatible determinado, indeterminado o incompatible) se deduce de la forma escalonada de la matriz ampliada.


<h4> <font font face = "arial"> <a name="AlgoritmoEG"> Algoritmo: </a> </h4>

  1. Ir a la primera columna número cero de izquierda a derecha.
  2. Si la primera fila tiene un cero en esta columna, intercambiarlo con otra que no lo tenga.
  3. Luego, obtener ceros debajo de este elemento delantero, sumando múltiplos adecuados del renglón superior a los renglones debajo de él.
  4. Cubrir el renglón superior y repetir el proceso anterior con la submatriz restante.

Este método se basa en la manipulación de ecuaciones y utiliza operaciones elementales en las filas de la matriz asociada, como intercambiar filas, multiplicar por un escalar y sumar o restar múltiplos de filas, para lograr la forma escalonada.

Es importante mencionar que si finalizamos las operaciones al hallar la forma escalonada reducida (forma lo más parecida a la matriz identidad), entonces el método se denomina eliminación de Gauss-Jordan.

<h6> <font font face = "arial"> Ejemplo </h6>

![Captura de pantalla 2024-03-14 081648](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/6d5bf86d-d638-49b6-832f-35c46df56603)


<h6> <font font face = "arial"> Solución </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 082025](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/267ac5c3-b5d2-429b-865f-96311a6a5a1e)


De la tercera fila se obtiene 2z=2, es decir, z=1. De la segunda fila obtenemos y=-1. Finalmente de la primera fila se obtiene x+2y+z=0, es deci, x=1.

Concluimos que la solución del sistema de ecuaciones es:

**x=1 
y=−1 
z=1**

<h4> <font font face = "arial"> <a name="ImplementaciónEG"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 083239](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/34355e8a-75a4-4020-afda-458b3d5a78e0)

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package eliminacióngaussiana.pkg1;
    
    public class EliminaciónGaussiana1 {
    
        public static void main(String[] args) {
            double[][] A = {{1, 2, 1}, {1, 0, 1}, {0, 1, 2}};
            double[] b = {0, 2, 1};
    
            double[] xyz = gaussElimination(A, b);
    
            System.out.println("Solución del sistema de ecuaciones:");
            System.out.println("x = " + xyz[0]);
            System.out.println("y = " + xyz[1]);
            System.out.println("z = " + xyz[2]);
        }
    
        public static double[] gaussElimination(double[][] A, double[] b) {
            int n = A.length;
    
            // Eliminación hacia adelante
            for (int k = 0; k < n-1; k++) {
                for (int i = k+1; i < n; i++) {
                    double factor = A[i][k] / A[k][k]; 
                    for (int j = k+1; j < n; j++) {
                        A[i][j] -= factor * A[k][j];
                    }
                    b[i] -= factor * b[k];
                }
                
            }
    
            // Sustitución hacia atrás
            double[] xyz = new double[n];
            for (int i = n-1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i+1; j < n; j++) {
                    sum += A[i][j] * xyz[j];
                }
                xyz[i] = (b[i] - sum) / A[i][i];
            }
            
            return xyz;
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 083727](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/25c8adaf-641e-49ca-9632-fd2420bfb9ce)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/Eliminaci%C3%B3n%20Gaussiana"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/Eliminaci%C3%B3n%20Gaussiana </font> </a>






<h3 align = "center"> <font font face = "forte"> <a name="Método de Gauss-Jordan"> 2. Método de Gauss-Jordan </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónGJ"> Descripción: </a> </h4>

   - Este método es una variante de la eliminación de Gauss.
   - Después de obtener la forma escalonada, se continúa hasta alcanzar la **forma escalonada reducida** (similar a la matriz identidad).
   - La matriz resultante proporciona directamente las soluciones del sistema de ecuaciones.
   - Útil para encontrar la **inversa de una matriz** y resolver sistemas de ecuaciones lineales.


<h4> <font font face = "arial"> <a name="AlgoritmoGJ"> Algoritmo: </a> </h4>

  1. Primero, se anota el sistema de ecuaciones en forma matricial, también llamada matriz aumentada.
  2. Se transforma esta matriz en una matriz identidad. Para ello, se pueden realizar las siguientes operaciones en las filas de la matriz:
      - Cambiar el orden de las filas.
      - Multiplicar o dividir todos los términos de una fila por un número diferente de 0.
      - Sustituir una fila por la suma de la misma fila más otra fila multiplicada por un número.
  3. Una vez que se ha obtenido la matriz identidad, las soluciones del sistema de ecuaciones son los términos independientes de la matriz.

Este método es eficiente para matrices 2x2 y 3x3. Al finalizar, no es necesario utilizar la sustitución hacia atrás para conseguir la solución.

Es importante mencionar que si finalizamos las operaciones al hallar la forma escalonada reducida (forma lo más parecida a la matriz identidad), entonces el método se denomina eliminación de Gauss-Jordan.

<h6> <font font face = "arial"> Ejemplo </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 093329](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/9f6eef94-97ff-4b0c-93e3-b19e6c091bf7)


<h6> <font font face = "arial"> Solución </h6>

Como primer paso dividimos el primer renglón R1 entre la componente a11:

![Captura de pantalla 2024-03-14 093436](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/de742227-e4f5-43ea-99ba-bab49121ad94)


Como segundo paso se requiere «convertir» las componentes inferiores de la componente a11 en ceros (0):

![Captura de pantalla 2024-03-14 093642](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/8f3df11f-28cf-4211-bc83-7be1501f6722)


Al tercer renglón (R3) se le restará el primer renglón multiplicado por la componente a 31.

![Captura de pantalla 2024-03-14 093757](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/c5d458c9-2d6d-4416-9401-689209979654)


Se procede a dividir el segundo renglón R2 entre la componente a 22:

![Captura de pantalla 2024-03-14 093846](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/4bb3b745-15df-49d2-a45d-e811d1c2e98b)


Ahora se repite todo el proceso para las demás columnas hasta obtener la forma deseada.

![Captura de pantalla 2024-03-14 094129](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/cc5affd2-a8e4-450f-91e8-df1252ecbf6c)


Finalmente, convertimos al sistema convencional de ecuaciones:

![Captura de pantalla 2024-03-14 094237](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/c37794dd-72a6-4fed-87d5-bb3ab4b09ef0)



<h4> <font font face = "arial"> <a name="ImplementaciónEG"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 094543](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/f7d0201a-943a-4e89-8526-8dd14ce454a9)


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package gaussjordan4;
    
    /**
     *
     * @author Rub_1
     */
    public class GaussJordan4 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // Definir las matrices directamente
            double[][] matrix = {
                {3, -2, 5, 38},
                {2, 4, -1, -7},
                {-7, -3, 4, 5}
            };
    
            // Realizar el algoritmo de Gauss-Jordan
            gaussJordan(matrix);
            
            // Imprimir la matriz en su forma escalonada reducida por filas
            System.out.println("La matriz en su forma escalonada reducida por filas es:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (Math.abs(matrix[i][j] - (int)matrix[i][j]) < 1e-6) {
                        System.out.print((int)matrix[i][j] + "\t");
                    } else {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println();
            }
            
            // Imprimir los valores de x, y, y z
            System.out.println("Solución del sistema de ecuaciones:");
            double x = matrix[0][matrix[0].length - 1];
            double y = matrix[1][matrix[0].length - 1];
            double z = matrix[2][matrix[0].length - 1];
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
        
        public static void gaussJordan(double[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            for (int k = 0; k < rows; k++) {
                // Pivoteo parcial
                int maxRow = k;
                for (int i = k + 1; i < rows; i++) {
                    if (Math.abs(matrix[i][k]) > Math.abs(matrix[maxRow][k])) {
                        maxRow = i;
                    }
                }
                double[] temp = matrix[k];
                matrix[k] = matrix[maxRow];
                matrix[maxRow] = temp;
                
                // Reducción
                for (int i = 0; i < rows; i++) {
                    if (i != k) {
                        double factor = matrix[i][k] / matrix[k][k];
                        for (int j = k; j < cols; j++) {
                            matrix[i][j] -= factor * matrix[k][j];
                        }
                    }
                }
                
                // Normalización
                double divisor = matrix[k][k];
                for (int j = k; j < cols; j++) {
                    matrix[k][j] /= divisor;
                }
            }
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 095352](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/bb217e66-ca29-432a-b56e-e63fc5af5931)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Gauss-Jordan"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Gauss-Jordan </font> </a>






<h3 align = "center"> <font font face = "forte"> <a name="Método de Gauss-Seidel"> 3. Método de Gauss-Seidel </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónGS"> Descripción: </a> </h4>

   - Este método se utiliza para resolver sistemas de ecuaciones lineales **iterativamente**.
   - Se basa en la descomposición de la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores anteriores.
   - Adecuado para sistemas con **matrices simétricas y dominantes**.
   - Converge más rápido si la matriz es **diagonalmente dominante**.


<h4> <font font face = "arial"> <a name="AlgoritmoGS"> Algoritmo: </a> </h4>

Este método es una versión acelerada de Jácobi. En el cual es necesario contar con un vector aproximado completo para proceder a la sustitución en las ecuaciones de recurrencia y obtener una nueva aproximación. En el método de Gauss-Seidel se propone ir sustituyendo los nuevos valores de la aproximación siguiente conforme se vayan obteniendo sin esperar a tener un vector completo. De esta forma se acelera la convergencia.

Para resolverlo podemos seguir los siguientes pasos:

  - Asignar valores iniciales a las incógnitas, pudiendo ser hipotéticos o arbitrarios.
  - Empezar con la primera ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando los valores asignados en el paso 1 para las otras incógnitas.
  - Proceder a la siguiente ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando el valor calculado en el paso anterior y los valores iniciales para las otras incógnitas.
  - Repetir este proceso para las ecuaciones restantes, calculando siempre el valor de la incógnita con el coeficiente más grande en cada ecuación y usando los últimos valores calculados para las otras incógnitas.
  - Continuar iterando hasta que los valores de las incógnitas no cambien significativamente entre iteraciones.

<h6> <font font face = "arial"> Ejemplo </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 102904](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/458c3e77-e9c7-43a2-b103-920edb9dfa8b)



<h6> <font font face = "arial"> Solución </h6>

Primero ordenamos las ecuaciones, de modo que en la diagonal principal esten los coeficientes mayores para asegurar la convergencia.

![Captura de pantalla 2024-03-14 103005](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/47d0ee06-e7e9-41f7-8e40-663588402e0e)


Despejamos cada una de las variables sobre la diagonal:

![Captura de pantalla 2024-03-14 103105](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/1d7a7bde-cd70-4f54-ae39-b52064d89db0)


Suponemos los valores iniciales X2 = 0 y X3 = 0 y calculamos X1

![Captura de pantalla 2024-03-14 103155](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/0301c346-48c4-47a7-9546-6debf0b94594)


Este valor junto con el de X3 se puede utilizar para obtener X2

![Captura de pantalla 2024-03-14 103249](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/7ebda8e3-20e9-4d59-943b-1eac163cea6f)


La primera iteración se completa sustituyendo los valores de X1 y X2 calculados obteniendo:

![Captura de pantalla 2024-03-14 103338](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/5e10ab47-c106-44c8-9b12-5a948a115020)


En la segunda iteración, se repite el mismo procedimiento:

![Captura de pantalla 2024-03-14 103429](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/68f0a07d-ab3f-44e9-b6f7-a26105bc9bdb)


Comparando los valores calculados entre la primera y la segunda iteración

![Captura de pantalla 2024-03-14 103519](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/d096c967-b8f9-4043-b37e-df4acc59391d)


Como podemos observar, no se cumple la condición.

![Captura de pantalla 2024-03-14 103604](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/670dfe30-d5de-4b74-b991-29798753f8cb)


Entonces tomamos los valores calculados en la última iteración y se toman como supuestos para la siguiente iteración. Se repite entonces el proceso:

![Captura de pantalla 2024-03-14 103643](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/306613b6-4ccf-40f7-93ab-ade3c53b47d8)


Comparando los valores obtenidos.

![Captura de pantalla 2024-03-14 103737](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/b94845e5-4f2f-4e02-8d0e-714747abfdf0)


Dado que se cumple la condición, el resultado es:

**X1 = 3.0**

**X2 = -2.5**

**X3 = 7.0**



<h4> <font font face = "arial"> <a name="ImplementaciónGS"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 104237](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/4431315d-e5cb-45c2-9110-d6a1f1bdc921)



<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package gaussseidel3;
    
    public class GaussSeidel3 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            double[][] coeficientes = {
                {3, -0.1, -0.2},
                {0.1, 7, -0.3},
                {0.3, -0.2, 10}
            };
            double[] terminosIndependientes = {7.85, -19.3, 71.4};
            double[] solucion = resolverSistema(coeficientes, terminosIndependientes);
            for (int i = 0; i < solucion.length; i++) {
                System.out.println("x[" + (i+1) + "] = " + solucion[i]);
            }
    
        }
    
        public static double[] resolverSistema(double[][] coeficientes, double[] terminosIndependientes) {
            int n = coeficientes.length;
            double[] x = new double[n];
            double[] nuevoX = new double[n];
            int iteracionesMaximas = 100;
            double epsilon = 1e-6;
    
            for (int iter = 0; iter < iteracionesMaximas; iter++) {
                for (int i = 0; i < n; i++) {
                    nuevoX[i] = terminosIndependientes[i];
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            nuevoX[i] -= coeficientes[i][j] * x[j];
                        }
                    }
                    nuevoX[i] /= coeficientes[i][i];
                }
    
                boolean detener = true;
                for (int i = 0; i < n; i++) {
                    if (Math.abs(nuevoX[i] - x[i]) > epsilon) {
                        detener = false;
                        break;
                    }
                }
    
                if (detener) {
                    break;
                }
    
                System.arraycopy(nuevoX, 0, x, 0, n);
            }
            return x;
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 142312](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/9c7c3b9d-5947-4c85-9aa9-9164e5b76c88)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Gauss-Seidel"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Gauss-Seidel </font> </a>









<h3 align = "center"> <font font face = "forte"> <a name="Método de Jacobi"> 4. Método de Jacobi </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónJ"> Descripción: </a> </h4>

   - Similar al método de Gauss-Seidel, es otra técnica iterativa para resolver sistemas de ecuaciones lineales.
   - Divide la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores iniciales.
   - Adecuado para sistemas con **matrices diagonales dominantes**.
   - Puede ser menos eficiente que Gauss-Seidel en términos de convergencia.


<h4> <font font face = "arial"> <a name="AlgoritmoJ"> Algoritmo: </a> </h4>

Este método es una versión acelerada de Jácobi. En el cual es necesario contar con un vector aproximado completo para proceder a la sustitución en las ecuaciones de recurrencia y obtener una nueva aproximación. En el método de Gauss-Seidel se propone ir sustituyendo los nuevos valores de la aproximación siguiente conforme se vayan obteniendo sin esperar a tener un vector completo. De esta forma se acelera la convergencia.

Para resolverlo podemos seguir los siguientes pasos:

  1. **Inicialización:** Se elige un vector inicial ( x^{(0)} ) para las soluciones.
  2. **Iteración:** En el paso ( k ), cada componente ( x_i^{(k+1)} ) del nuevo vector solución se calcula usando la fórmula:

     ![Captura de pantalla 2024-03-14 112233](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/fb829ecf-31bb-4f61-9622-56195d0fdb09)

    donde ( a_{ii} ) es el coeficiente de la diagonal de la matriz de coeficientes, ( b_i ) es el término independiente de la ecuación, y la suma se realiza sobre todos los ( j ) excepto ( i ).
  3. **Convergencia:** Se repite el proceso hasta que la diferencia entre las soluciones en iteraciones sucesivas sea menor que un umbral preestablecido.


<h6> <font font face = "arial"> Ejemplo </h6>

![Captura de pantalla 2024-03-14 112543](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/54dab2fb-0083-4a84-9781-753403130116)



<h4> <font font face = "arial"> <a name="ImplementaciónJ"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 113047](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/503de3e6-85cf-457b-9a5e-30e25f60ccf1)



<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package jacobi4;
    
    public class Jacobi4 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            double[][] coeficientes = {
                {6,2,-1,4},
                {1,5,1,3},
                {2,1,4,27}
            };
            
            double[] valoresIniciales = {0, 0, 0}; // Valores iniciales de las incógnitas
            double tolerancia = 0.0001; // Tolerancia para el criterio de convergencia
            int iteracionesMaximas = 1000; // Número máximo de iteraciones
            
            double[] solucion = jacobi(coeficientes, valoresIniciales, tolerancia, iteracionesMaximas);
            
            if (solucion != null) {
                System.out.println("Solución del sistema de ecuaciones:");
                System.out.println("x = " + solucion[0]);
                System.out.println("y = " + solucion[1]);
                System.out.println("z = " + solucion[2]);
            } else {
                System.out.println("El método no converge.");
            }
        }
        
        public static double[] jacobi(double[][] coeficientes, double[] valoresIniciales, double tolerancia, int iteracionesMaximas) {
            int n = valoresIniciales.length;
            double[] solucion = new double[n];
            double[] solucionAnterior = new double[n];
            int iteraciones = 0;
            double error = tolerancia + 1;
            
            // Inicializar la solución con los valores iniciales
            System.arraycopy(valoresIniciales, 0, solucion, 0, n);
            
            // Iterar hasta que se alcance la tolerancia o el número máximo de iteraciones
            while (error > tolerancia && iteraciones < iteracionesMaximas) {
                // Copiar la solución anterior
                System.arraycopy(solucion, 0, solucionAnterior, 0, n);
                
                // Calcular la nueva solución
                for (int i = 0; i < n; i++) {
                    double suma = 0;
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            suma += coeficientes[i][j] * solucionAnterior[j];
                        }
                    }
                    solucion[i] = (coeficientes[i][n] - suma) / coeficientes[i][i];
                }
                
                // Calcular el error
                error = 0;
                for (int i = 0; i < n; i++) {
                    error += Math.abs(solucion[i] - solucionAnterior[i]);
                }
                
                iteraciones++;
            }
            
            // Verificar la convergencia
            if (error <= tolerancia) {
                return solucion;
            } else {
                return null; // No converge
            }
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 113337](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/a6842b59-ba5e-4f50-be8a-4f888f32b80d)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Jacobi"> <font font face = "arial"> https://github.com/rubivj13/Metodos_Numericos_Tema-3/tree/main/M%C3%A9todo%20de%20Jacobi </font> </a>


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 4"> TEMA 4 </a>  </i> </b> </font> </h1>

# <h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T4"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos de solución de problemas aplicando diferenciación y integración. Estos métodos son:

1. **Método del Trapecio**:
   - Divide el intervalo de integración en segmentos trapezoidales.
   - Aproxima la integral de una función como la suma de áreas de estos trapezoides.
   - Simple de implementar pero menos preciso que otros métodos.
   - La precisión mejora al aumentar el número de segmentos.

2. **Método de Simpson 1/3**:
   - Utiliza parábolas para aproximar la función en cada segmento.
   - Divide el intervalo en subintervalos de igual longitud.
   - Más preciso que el método del trapecio.
   - Funciona bien para funciones suaves.

3. **Método de Simpson 3/8**:
   - Similar al método de Simpson 1/3, pero divide el intervalo en subintervalos de longitud diferente.
   - Utiliza polinomios cúbicos para aproximar la función.
   - Mayor precisión que el método de Simpson 1/3.

4. **Método de la Cuadratura Gaussiana**:
   - Selecciona puntos y pesos óptimos para la aproximación de la integral.
   - No ajusta polinomios a la función, lo que lo hace más preciso.
   - Ideal para funciones con oscilaciones rápidas o discontinuidades.


# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T4"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T4"> Competencia de la Asignatura </a> </h3>

...
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Competencia del tema T4"> Competencia del tema </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Temario T3"> Temario  </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de solución de sistemas de problemas aplicando diferenciación y integración que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de solución de sistemas de problemas aplicando diferenciación y integración que se encuentran en nuestro repositorio. </a> </font> </h2>

# <h3 align = "center"> <font font face = "forte"> <a name="Método del Trapecio"> 1. Método del Trapecio </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónT"> Descripción. </a> </h4>

El Método del Trapecio es una técnica de integración numérica que se utiliza para estimar el valor de una integral definida. Este método se basa en la idea de aproximar el área bajo la curva de una función mediante la suma de las áreas de varios trapecios.

El procedimiento del Método del Trapecio se puede describir de la siguiente manera:

1. **Segmentación**: El intervalo de integración, desde `a` hasta `b`, se divide en `n` segmentos de igual longitud. Esta longitud, denotada como `h`, se calcula como `(b - a) / n`.

2. **Evaluación de la función**: Se evalúa la función que se desea integrar en los puntos `a`, `a + h`, `a + 2h`, ..., hasta `b`. Estos valores representan las alturas de los trapecios.

3. **Cálculo de la suma**: Se suman todos los valores de la función obtenidos en el paso anterior. Sin embargo, los valores en los extremos del intervalo de integración (es decir, en `a` y `b`) se multiplican por 0.5. Esto se debe a que, en el cálculo del área de un trapecio, las alturas se suman y luego se dividen por 2.

4. **Estimación de la integral**: La suma obtenida en el paso anterior se multiplica por `h`. El resultado es la estimación de la integral definida.

Es importante destacar que el Método del Trapecio proporciona una aproximación de la integral definida y que la precisión de esta aproximación aumenta con el número de segmentos `n` utilizados. Sin embargo, para funciones complejas o cuando se requiere una alta precisión, pueden ser necesarios métodos de integración numérica más sofisticados.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoT"> Algoritmo. </a> </h4>

1. **Divide el área bajo la curva** que quieres integrar en `n` segmentos de igual ancho. Este ancho se conoce como `h` y se calcula como `(b - a) / n`, donde `a` y `b` son los límites inferior y superior de la integral, respectivamente.

2. **Calcula los valores de la función** en los puntos `a`, `a + h`, `a + 2h`, ..., `b`. Estos son los valores de `y` en cada punto.

3. **Suma los valores de la función** en todos los puntos, pero multiplica por 0.5 los valores en los puntos extremos (es decir, en `a` y `b`).

4. **Multiplica la suma obtenida** en el paso anterior por `h`. El resultado es la aproximación de la integral definida.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Representación gráficaT"> Representación gráfica. </a> </h4>

![Captura de pantalla 2024-04-24 201152](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/a70b8b80-f72b-4284-a767-70fb837f85c3)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónT"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package MetodoTrapecio;
    
    import java.util.function.Function;
    
    /**
     *
     * @author Rub_1
     */
    public class Ejercicio1 {
    
        public static double trapezoidalRule(Function<Double, Double> f, double a, double b, int n) {
            double h = (b - a) / n;
            double sum = 0.5 * (f.apply(a) + f.apply(b));
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                sum += f.apply(x);
            }
            return h * sum;
        }
    
        public static void main(String[] args) {
            
            System.out.println("\t\t\t\t Método Trapecio - Ejercicio 1 \n");
            
            // Definir la función a integrar
            Function<Double, Double> f = x -> Math.exp(Math.pow(x, 4)); // Definir la función a integrar: e^(x^4)
    
            // Límites de integración
            double a = -1; // Límite inferior
            double b = 1; // Límite superior
    
            // Número de subintervalos
            int n = 1; // Ajustar este valor según la precisión deseada
    
            // Calcular la integral usando la regla del trapecio
            double result = trapezoidalRule(f, a, b, n);
            System.out.println("El resultado de la integral es: " + result);
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-04-24 202409](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/a414add6-f39a-4793-a395-41a5feb0c3c6)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoTrapecio"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoTrapecio </font> </a>










# <h3 align = "center"> <font font face = "forte"> <a name="Método de la Regla de Simpson 1/3"> 2. Método de la Regla de Simpson 1/3 </a> </h3>

<h4> <font font face = "arial"> <a name="Descripción1/3"> Descripción. </a> </h4>

El Método de Simpson 1/3 es una técnica de integración numérica que se utiliza para estimar el valor de una integral definida. Este método se basa en la idea de aproximar el área bajo la curva de una función utilizando parábolas.

El procedimiento del Método de Simpson 1/3 se puede describir de la siguiente manera:

1. **Segmentación**: El intervalo de integración, desde `a` hasta `b`, se divide en `n` segmentos de igual longitud. Esta longitud, denotada como `h`, se calcula como `(b - a) / n`. Para el Método de Simpson 1/3, `n` debe ser un número par.

2. **Evaluación de la función**: Se evalúa la función que se desea integrar en los puntos `a`, `a + h`, `a + 2h`, ..., hasta `b`. Estos valores representan las alturas de las parábolas.

3. **Cálculo de la suma**: Se suman todos los valores de la función obtenidos en el paso anterior. Los valores en los extremos del intervalo de integración (es decir, en `a` y `b`) se multiplican por 1, y los valores en los puntos intermedios se multiplican por 4 si su índice es impar, y por 2 si su índice es par.

4. **Estimación de la integral**: La suma obtenida en el paso anterior se multiplica por `h/3`. El resultado es la estimación de la integral definida.

Es importante destacar que el Método de Simpson 1/3 proporciona una aproximación de la integral definida y que la precisión de esta aproximación aumenta con el número de segmentos `n` utilizados. Sin embargo, para funciones complejas o cuando se requiere una alta precisión, pueden ser necesarios métodos de integración numérica más sofisticados.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Algoritmo1/3"> Algoritmo. </a> </h4>

1. **Divide el área bajo la curva** que quieres integrar en `n` segmentos de igual ancho. Este ancho se conoce como `h` y se calcula como `(b - a) / n`, donde `a` y `b` son los límites inferior y superior de la integral, respectivamente. Para el Método de Simpson 1/3, `n` debe ser un número par.

2. **Calcula los valores de la función** en los puntos `a`, `a + h`, `a + 2h`, ..., `b`. Estos son los valores de `y` en cada punto.

3. **Suma los valores de la función** en todos los puntos, pero multiplica por 1 los valores en los puntos extremos (es decir, en `a` y `b`), y multiplica por 4 los valores en los puntos con índice impar, y por 2 los valores en los puntos con índice par.

4. **Multiplica la suma obtenida** en el paso anterior por `h/3`. El resultado es la aproximación de la integral definida.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Representación gráfica1/3"> Representación gráfica. </a> </h4>

![Captura de pantalla 2024-04-24 203923](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/c7bdf1cb-850c-4aef-9395-f1dffd736718)



![Captura de pantalla 2024-04-24 204028](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/987e92ba-ca30-4bde-9428-78d6153d4ad4)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Implementación1/3"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package MetodoReglaSimpson1_3;

    import java.util.function.Function;
    
    /**
     *
     * @author Rub_1
     */
    public class Ejercicio4 {
        
        public static double simpsonOneThirdRule(Function<Double, Double> f, double a, double b, int n) {
            double h = (b - a) / n;
            double sum = f.apply(a) + f.apply(b);
            
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                if (i % 2 == 0) {
                    sum += 2 * f.apply(x);
                } else {
                    sum += 4 * f.apply(x);
                }
            }
            
            return (h / 3) * sum;
        }
    
        public static void main(String[] args) {
            
            System.out.println("\t\t\t\t Método de la Regla de Simpson 1/3 - Ejercicio 4 \n");
            
            // Definir la función a integrar
            Function<Double, Double> f = x -> Math.exp(-x) / Math.sqrt(x + 1); // Función a integrar: e^(-x) / sqrt(x + 1)
    
            // Límites de integración
            double a = 0; // Límite inferior
            double b = 2; // Límite superior
    
            // Número de subintervalos (debe ser par)
            int n = 2; // Ajustar este valor según la precisión deseada
            if (n % 2 != 0) {
                System.out.println("El número de subintervalos debe ser par.");
                return;
            }
    
            // Calcular la integral usando el método de Simpson 1/3
            double result = simpsonOneThirdRule(f, a, b, n);
            System.out.println("El resultado de la integral es: " + result);
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-04-24 204257](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/8b81bdb7-3474-4391-a31f-0231b0e25490)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoReglaSimpson1_3"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoReglaSimpson1_3 </font> </a>










# <h3 align = "center"> <font font face = "forte"> <a name="Método de la Regla de Simpson 3/8"> 3. Método de la Regla de Simpson 3/8 </a> </h3>

<h4> <font font face = "arial"> <a name="Descripción3/8"> Descripción. </a> </h4>

El Método de Simpson 3/8 es una técnica de integración numérica que se utiliza para estimar el valor de una integral definida. Este método se basa en la idea de aproximar el área bajo la curva de una función utilizando parábolas.

El procedimiento del Método de Simpson 3/8 se puede describir de la siguiente manera:

1. **Segmentación**: El intervalo de integración, desde `a` hasta `b`, se divide en `n` segmentos de igual longitud. Esta longitud, denotada como `h`, se calcula como `(b - a) / n`. Para el Método de Simpson 3/8, `n` debe ser un múltiplo de 3.

2. **Evaluación de la función**: Se evalúa la función que se desea integrar en los puntos `a`, `a + h`, `a + 2h`, ..., hasta `b`. Estos valores representan las alturas de las parábolas.

3. **Cálculo de la suma**: Se suman todos los valores de la función obtenidos en el paso anterior. Los valores en los extremos del intervalo de integración (es decir, en `a` y `b`) se multiplican por 1, los valores en los puntos con índice múltiplo de 3 se multiplican por 2, y los demás valores se multiplican por 3.

4. **Estimación de la integral**: La suma obtenida en el paso anterior se multiplica por `3h/8`. El resultado es la estimación de la integral definida.

Es importante destacar que el Método de Simpson 3/8 proporciona una aproximación de la integral definida y que la precisión de esta aproximación aumenta con el número de segmentos `n` utilizados. Sin embargo, para funciones complejas o cuando se requiere una alta precisión, pueden ser necesarios métodos de integración numérica más sofisticados.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Algoritmo3/8"> Algoritmo. </a> </h4>

1. **Divide el área bajo la curva** que quieres integrar en `n` segmentos de igual ancho. Este ancho se conoce como `h` y se calcula como `(b - a) / n`, donde `a` y `b` son los límites inferior y superior de la integral, respectivamente. Para el Método de Simpson 3/8, `n` debe ser un múltiplo de 3.

2. **Calcula los valores de la función** en los puntos `a`, `a + h`, `a + 2h`, ..., `b`. Estos son los valores de `y` en cada punto.

3. **Suma los valores de la función** en todos los puntos, pero multiplica por 1 los valores en los puntos extremos (es decir, en `a` y `b`), multiplica por 3 los valores en los puntos con índice que no es múltiplo de 3, y multiplica por 2 los valores en los puntos con índice múltiplo de 3.

4. **Multiplica la suma obtenida** en el paso anterior por `3h/8`. El resultado es la aproximación de la integral definida.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Representación gráfica3/8"> Representación gráfica. </a> </h4>

![Captura de pantalla 2024-04-24 205002](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/f842c66f-70b7-40ba-82fa-255d492803d6)



![Captura de pantalla 2024-04-24 205221](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/482efc62-98c2-432a-ac79-16f6273309b4)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Implementación3/8"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package MetodoReglaSimpson3_8;

    import java.util.function.Function;
    
    /**
     *
     * @author Rub_1
     */
    public class Ejercicio2 {
        
        public static double simpsonThreeEighthRule(Function<Double, Double> f, double a, double b, int n) {
            double h = (b - a) / n;
            double sum = f.apply(a) + f.apply(b);
            
            for (int i = 1; i < n; i++) {
                double x = a + i * h;
                if (i % 3 == 0) {
                    sum += 2 * f.apply(x);
                } else {
                    sum += 3 * f.apply(x);
                }
            }
            
            return (3 * h / 8) * sum;
        }
    
        public static void main(String[] args) {
            
            System.out.println("\t\t\t\t Método de la Regla de Simpson 3/8 - Ejercicio 2 \n");
            
            // Definir la función a integrar
            Function<Double, Double> f = x -> Math.log(x * x + 1) / Math.sqrt(x + 1);
    
            // Límites de integración
            double a = 1; // Límite inferior
            double b = 5; // Límite superior
    
            // Número de subintervalos (debe ser múltiplo de 3)
            int n = 6; // Ajustar este valor según la precisión deseada
            if (n % 3 != 0) {
                System.out.println("El número de subintervalos debe ser múltiplo de 3.");
                return;
            }
    
            // Calcular la integral usando el método de Simpson 3/8
            double result = simpsonThreeEighthRule(f, a, b, n);
            System.out.println("El resultado de la integral es: " + result);
        }
        
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-04-24 205402](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/db2db153-d411-4852-b384-75eabeb027df)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoReglaSimpson3_8"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoReglaSimpson3_8 </font> </a>











# <h3 align = "center"> <font font face = "forte"> <a name="Método de la Cuadratura Gaussiana"> 4. Método de la Cuadratura Gaussiana </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónCG"> Descripción. </a> </h4>

El Método de la Cuadratura Gaussiana se basa en la elección óptima de los puntos en los que se evalúa la función, en lugar de utilizar un conjunto uniforme de puntos como en los métodos del Trapecio o Simpson. Estos puntos, conocidos como los puntos de Gauss, se eligen de tal manera que se maximiza la precisión de la integral para un número dado de puntos.

El procedimiento del Método de la Cuadratura Gaussiana se puede describir de la siguiente manera:

1. **Elección de los puntos de Gauss y los pesos asociados**: Los puntos de Gauss y sus pesos asociados se eligen de antemano. Estos se pueden obtener de tablas o calcular utilizando polinomios ortogonales. El número de puntos de Gauss determina el grado del polinomio que se ajustará exactamente por el método.

2. **Transformación del intervalo de integración**: El intervalo de integración original, desde `a` hasta `b`, se transforma a un intervalo estándar, generalmente de `-1` a `1` o de `0` a `1`. Esto se hace para facilitar el cálculo y porque los puntos de Gauss se definen para estos intervalos estándar.

3. **Evaluación de la función**: Se evalúa la función que se desea integrar en los puntos de Gauss transformados.

4. **Cálculo de la suma ponderada**: Se calcula la suma ponderada de los valores de la función en los puntos de Gauss, utilizando los pesos de Gauss.

5. **Estimación de la integral**: La suma ponderada obtenida en el paso anterior es la estimación de la integral definida en el intervalo estándar. Esta estimación se transforma de nuevo al intervalo original para obtener la estimación final de la integral.

Es importante destacar que el Método de la Cuadratura Gaussiana proporciona una aproximación de la integral definida y que la precisión de esta aproximación puede ser muy alta, incluso con un número relativamente pequeño de puntos de Gauss. Sin embargo, el cálculo de los puntos de Gauss y sus pesos puede ser complejo, y el método puede ser menos eficaz para funciones que no son suaves o que tienen discontinuidades.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoCG"> Algoritmo. </a> </h4>

1. **Elección de los puntos de Gauss y los pesos asociados**: Los puntos de Gauss y sus pesos asociados se eligen de antemano. Estos se pueden obtener de tablas o calcular utilizando polinomios ortogonales. El número de puntos de Gauss determina el grado del polinomio que se ajustará exactamente por el método.

2. **Transformación del intervalo de integración**: El intervalo de integración original, desde `a` hasta `b`, se transforma a un intervalo estándar, generalmente de `-1` a `1` o de `0` a `1`. Esto se hace para facilitar el cálculo y porque los puntos de Gauss se definen para estos intervalos estándar.

3. **Evaluación de la función**: Se evalúa la función que se desea integrar en los puntos de Gauss transformados.

4. **Cálculo de la suma ponderada**: Se calcula la suma ponderada de los valores de la función en los puntos de Gauss, utilizando los pesos de Gauss.

5. **Estimación de la integral**: La suma ponderada obtenida en el paso anterior es la estimación de la integral definida en el intervalo estándar. Esta estimación se transforma de nuevo al intervalo original para obtener la estimación final de la integral.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="Representación gráficaT"> Representación gráfica. </a> </h4>

![Captura de pantalla 2024-04-24 210315](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/7472dc68-d1d6-4832-a5c9-a4f429f2353e)



![Captura de pantalla 2024-04-24 210402](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/92f193e6-db70-4f59-a867-43afe23c3b11)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónCG"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package MetodoCuadraturaGaussiana;

    import java.util.function.Function;
    
    /**
     *
     * @author Rub_1
     */
    public class Ejercicio5 {
        
        // Coeficientes y nodos para la cuadratura Gaussiana con 8 puntos
        private static final double[] nodos = {0, 0.183434642495650, -0.183434642495650, 0.525532409916329, -0.525532409916329, 0.796666477413627, -0.796666477413627, 0.960289856497536, -0.960289856497536};
        private static final double[] pesos = {0.361418309562439, 0.313706645877887, 0.313706645877887, 0.222381034453374, 0.222381034453374, 0.101228536290376, 0.101228536290376, 0.062303530026471, 0.062303530026471};
        
    
        public static double cuadraturaGaussiana(Function<Double, Double> f, double a, double b) {
            double suma = 0;
            double escala = (b - a) / 2.0;
            double desplazamiento = (a + b) / 2.0;
            for (int i = 0; i < nodos.length; i++) {
                double x = escala * nodos[i] + desplazamiento;
                suma += pesos[i] * f.apply(x);
            }
            return escala * suma;
        }
    
        public static void main(String[] args) {
            
            System.out.println("\t\t\t\t Método de la Cuadratura Gaussiana - Ejercicio 5 \n");
            
            // Definir la función a integrar
            Function<Double, Double> f = x -> Math.sin(x) + Math.cos(x); // Función: sin(x) + cos(x)
    
            // Límites de integración
            double a = 0; // Límite inferior
            double b = Math.PI / 2; // Límite superior
    
            // Calcular la integral usando el método de cuadratura Gaussiana
            double resultado = cuadraturaGaussiana(f, a, b);
            System.out.println("El resultado de la integral es: " + resultado);
        }
        
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-04-24 210524](https://github.com/rubivj13/MetodosNumericos_Tema4/assets/147438464/81fb253a-87e3-4461-83bd-906ec5ea4647)


Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoCuadraturaGaussiana"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericos_Tema4/tree/master/src/MetodoCuadraturaGaussiana </font> </a>


---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 5"> TEMA 5 </a>  </i> </b> </font> </h1>

# <h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T5"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos seis métodos de interpolación. Estos métodos son:

1. **Método de interpolación lineal**:
   - Estima la ubicación de un punto dentro de un intervalo numérico.
   - Supone que los valores extremos del intervalo están unidos por una recta.
   - Es la forma más simple de interpolación.
   - Se utiliza para estimar valores intermedios entre dos puntos conocidos.

2. **Método de interpolación cuadrática**:
   - Utiliza una función cuadrática o parábola para realizar la interpolación.
   - Es más preciso que la interpolación lineal.
   - Utiliza un polinomio de segundo grado en lugar de uno de primer grado.

3. **Método de interpolación de Lagrange**:
   - Utiliza un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar.
   - Es útil para situaciones que requieran un número bajo de puntos para interpolar.
   - El grado del polinomio es igual al número de puntos menos uno.

4. **Método de interpolación de Newton**:
   - Utiliza un polinomio para interpolar un conjunto de puntos.
   - Es útil para situaciones que requieran un número alto de puntos para interpolar.
   - A medida que crece el número de puntos, también lo hace el grado del polinomio.

5. **Método de correlación**:
   - Se utiliza para medir y comprender el grado de correlación entre dos variables.
   - Se utiliza para analizar cómo varía una variable cuando la otra presenta modificaciones.
   - Permite identificar patrones y tendencias en un conjunto de datos.

6. **Método de regresión**:
   - Permite examinar la relación entre dos o más variables.
   - Identifica cuáles son las variables que tienen mayor impacto en un tema de interés.
   - Se utiliza para predecir el valor de una variable dependiente a partir de una o más variables independientes.

********************************************************************************************************************************************************************************************************************

# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T5"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T5"> Competencia de la Asignatura </a> </h3>

...
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Competencia del tema T5"> Competencia del tema </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Temario T5"> Temario  </a> </h3>

...

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------





# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de interpolación que se encuentran en nuestro repositorio. </a> </font> </h2>

# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación lineal"> 1. Método interpolación lineal </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIL"> Descripción. </a> </h4>

El **Método de interpolación lineal** es un procedimiento muy utilizado para estimar los valores que toma una función en un intervalo del cual conocemos sus valores en los extremos.

- Este método consiste en estimar la ubicación de un punto dentro de un intervalo numérico, suponiendo que los valores extremos de dicho intervalo están unidos por una recta.
- Conocida la ecuación de esta recta, es posible ubicar el punto desconocido.
- La interpolación lineal es rápida y sencilla, pero en ciertos casos no muy precisa.
- Se tienen dos puntos de coordenadas [xo, f (xo)] y [x1, f (x1)] entre los cuales está el punto [x, g (x)], cuyas coordenadas se desea conocer.
- El primer paso consiste en unir los puntos conocidos mediante un segmento de recta, sobre el cual se encuentran las coordenadas del punto a calcular.
- Como se puede ver, se forman dos triángulos rectángulos: ABC y APD, que además tienen un ángulo agudo en común, por lo que son triángulos semejantes, a los que se puede aplicar el teorema de Thales.
- De allí se procede a despejar g (x): Llamando: f1(x1) = y1 ; fo(xo) = yo ; g (x) = y. La ecuación de arriba se transforma en: y = yo + ((y1 - yo)/(x1 - xo)) * (x - xo).
- Cuando se aproxima una función con este método, la cota de error viene dada por el valor absoluto de la diferencia entre la función f (x) y la recta interpoladora g (x): Error = │f (x) − g (x) │.

Formúla


![Captura de pantalla 2024-05-15 170129](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/345e786b-affa-45ea-ac2b-b383d36a40ce)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIL"> Algoritmo. </a> </h4>

1. **Determinar el punto incógnita P (x,y)**: Este es el punto que queremos estimar.

2. **Establecer los dos puntos que limitan el intervalo donde se encuentra el valor a calcular**, es decir, los puntos (x₀, y₀) y (x₁, y₁): Estos son los dos puntos conocidos que se utilizan para la interpolación.

3. **Sustituir todos los valores en la ecuación**: La ecuación de interpolación lineal es f_1(x) = f(x_0) + ((f(x_1) - f(x_0))/(x_1 - x_0))* (x - x_0). Sustituye los valores de x₀, y₀, x₁, y₁ y x en esta ecuación.

![Captura de pantalla 2024-05-15 170129](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/3c39c286-c5fa-42fb-a46a-af76b2ef1d86)


4. **Calcular el resultado**: Realiza los cálculos necesarios para obtener el valor de y.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIL"> Pseudocódigo. </a> </h4>


    Función Interpolacion_Lineal(x0, y0, x1, y1, x):
        pendiente = (y1 - y0) / (x1 - x0)
        resultado = y0 + pendiente * (x - x0)
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIL"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_Lineal;
    
    public class Ejercicio1 {
    
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {6, 7, 8, 9, 10}; // Valores de x
            double[] y = {2.5, 3.7, 1.5, 2.6, 7.8}; // Valores de y
    
            // Punto de interpolación
            double xInterpolation = 2.5;
    
            // Realizar la interpolación lineal
            double yInterpolated = linearInterpolation(x, y, xInterpolation);
    
            // Imprimir el resultado
            System.out.println("El valor interpolado en x=" + xInterpolation + " es: " + yInterpolated);
        }
    
        public static double linearInterpolation(double[] x, double[] y, double xInterpolation) {
            int n = x.length;
    
            // Encontrar el índice i tal que x[i] <= xInterpolation < x[i+1]
            int i = 0;
            while (i < n - 1 && x[i] < xInterpolation) {
                i++;
            }
    
            // Calcular la pendiente (m) y el intercepto (b) de la recta entre (x[i], y[i]) y (x[i+1], y[i+1])
            double m = (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
            double b = y[i] - m * x[i];
    
            // Calcular el valor interpolado
            return m * xInterpolation + b;
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-15 171250](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/b6d99ed5-f4c6-4616-80ab-14370665dbe6)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_Lineal"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_Lineal </font> </a>














# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación cuadrática"> 2. Método interpolación cuadrática </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIC"> Descripción. </a> </h4>

La **interpolación cuadrática** es un método que se utiliza para encontrar una función polinómica de segundo grado (un polinomio cuadrático) que pasa por un conjunto dado de puntos. Este método es útil cuando los datos siguen una tendencia cuadrática.

La fórmula general para un polinomio cuadrático es:

![Captura de pantalla 2024-05-15 172627](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/d36d6bb4-2f25-4e62-a080-5ad9aed39bc7)


Donde (x_0), (x_1) y (x_2) son los puntos conocidos, y (a), (b) y (c) son coeficientes que se calculan a partir de los valores de la función en esos puntos:

![Captura de pantalla 2024-05-15 172757](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/cc0b2531-2d96-4f17-9809-bace2f5b1f6a)



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIC"> Algoritmo. </a> </h4>

1. **Determinar los tres puntos conocidos (x₀, y₀), (x₁, y₁) y (x₂, y₂)**: Estos son los tres puntos que se utilizan para la interpolación.

2. **Calcular los coeficientes a, b y c**:

![Captura de pantalla 2024-05-15 172757](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/cc0b2531-2d96-4f17-9809-bace2f5b1f6a)


3. **Sustituir todos los valores en la ecuación**: La ecuación de interpolación cuadrática es f_1(x) = f(x_0) + ((f(x_1) - f(x_0))/(x_1 - x_0))* (x - x_0). Sustituye los valores de x₀, y₀, x₁, y₁, x₂, y₂ y x en esta ecuación.

![Captura de pantalla 2024-05-15 172627](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/d36d6bb4-2f25-4e62-a080-5ad9aed39bc7)


4. **Calcular el resultado**: Realiza los cálculos necesarios para obtener el valor de y.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIC"> Pseudocódigo. </a> </h4>

    
    Función Minimos_Cuadrados(datos_x, datos_y):
        n = longitud(datos_x)
        sum_x = 0
        sum_y = 0
        sum_xy = 0
        sum_xx = 0
        
        Para cada i en rango(0, n):
            sum_x = sum_x + datos_x[i]
            sum_y = sum_y + datos_y[i]
            sum_xy = sum_xy + datos_x[i] * datos_y[i]
            sum_xx = sum_xx + datos_x[i] * datos_x[i]
        
        pendiente = (n * sum_xy - sum_x * sum_y) / (n * sum_xx - sum_x * sum_x)
        intercepto = (sum_y - pendiente * sum_x) / n
        
        devolver pendiente, intercepto
    
    Función Interpolacion_Minimos_Cuadrados(pendiente, intercepto, x):
        resultado = pendiente * x + intercepto
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIC"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_Mínimos_Cuadrados;
    
    public class Ejercicio1 {
        
         public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};
    
            // Grado del polinomio interpolador
            int degree = 2;
    
            // Realizar la interpolación de mínimos cuadrados
            double[] coefficients = leastSquaresInterpolation(x, y, degree);
    
            // Evaluar el polinomio interpolador en un punto dado
            double targetX = 2.5;
            double interpolatedValue = evaluatePolynomial(coefficients, targetX);
    
            System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
        }
    
        public static double[] leastSquaresInterpolation(double[] x, double[] y, int degree) {
            int n = x.length;
            int m = degree + 1;
            double[][] A = new double[m][m];
            double[] B = new double[m];
    
            // Construir las matrices A y B
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    double sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += Math.pow(x[k], i + j);
                    }
                    A[i][j] = sum;
                }
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += y[k] * Math.pow(x[k], i);
                }
                B[i] = sum;
            }
    
            // Resolver el sistema de ecuaciones lineales
            double[] coefficients = solveSystemOfEquations(A, B);
            return coefficients;
        }
    
        public static double[] solveSystemOfEquations(double[][] A, double[] B) {
            // Implementación de un algoritmo para resolver sistemas de ecuaciones lineales
            // (por ejemplo, el método de Gauss-Jordan)
            // Devolvemos un conjunto de coeficientes aleatorios para este ejemplo
            int n = B.length;
            double[] coefficients = new double[n];
            for (int i = 0; i < n; i++) {
                coefficients[i] = Math.random(); // Coeficientes aleatorios
            }
            return coefficients;
        }
    
        public static double evaluatePolynomial(double[] coefficients, double x) {
            double result = 0;
            for (int i = 0; i < coefficients.length; i++) {
                result += coefficients[i] * Math.pow(x, i);
            }
            return result;
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 210034](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/cc68126e-25d4-4d2a-8d36-a7de9e39543e)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_M%C3%ADnimos_Cuadrados"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_M%C3%ADnimos_Cuadrados </font> </a>














# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación de Lagrange"> 3. Método interpolación de Lagrange </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónILa"> Descripción. </a> </h4>

El **Método de interpolación de Lagrange** es un método numérico que se utiliza para aproximar funciones. Este método hace uso de un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar.

- Este método fue publicado por Joseph-Louis de Lagrange en 1795, aunque fue descubierto por Edward Waring en 1779 y redescubierto por Leonhard Euler en 1783.
- La interpolación de Lagrange es útil cuando la función a aproximar es suave, incluso fuera de los valores dados o conocidos¹.
- El polinomio que aproxima a la función \(f(x)\) es un polinomio \(P(x)\) de grado \(n-1\), construido mediante la combinación lineal de \(n\) polinomios \(L_i(x)\) de grado \(n-1\).
- Estos son los polinomios de Lagrange, que se expresan de la siguiente manera: 

![Captura de pantalla 2024-05-15 174153](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/31c19746-5625-423c-97ef-b204e4ad4dcc)


    
- Los valores de \(y_i\) representan las ordenadas correspondientes a las abscisas \(x_i\) donde la función \(f(x)\) es conocida, es decir: \(y_i = f(x_i)\).
- Los polinomios de Lagrange son exactamente iguales a la unidad cuando se les evalúa en la abscisa correspondiente a su índice, es decir: \(L_i(x_i) = 1\).
- Se anulan en las abscisas de los puntos de interpolación con índice diferente al del mismo polinomio: \(L_i(x_j) = 0\), con \(i \neq j\)¹.
- Tomando otros valores de abscisas diferentes a los puntos de interpolación, los polinomios de Lagrange adquieren valores comprendidos entre \(-1\) y \(+1\).
- Para obtener los polinomios de Lagrange solo se requiere conocer las abscisas de los puntos a interpolar.


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoILa"> Algoritmo. </a> </h4>

1. **Determinar los puntos conocidos (x₀, y₀), (x₁, y₁), ..., (xₙ, yₙ)**: Estos son los puntos que se utilizan para la interpolación.

2. **Calcular los polinomios de Lagrange Lᵢ(x) para i = 0, 1, ..., n**:
   - Cada polinomio Lᵢ(x) se calcula como el producto de los términos \((x - xⱼ)/(xᵢ - xⱼ)\) para todo j ≠ i. Es decir:

![Captura de pantalla 2024-05-15 174515](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/63fe0292-9b46-4325-93ea-0307d6e7d8a6)



3. **Construir el polinomio de interpolación P(x)**: El polinomio de interpolación se obtiene como la suma de los productos de los polinomios de Lagrange Lᵢ(x) y los valores correspondientes de la función yᵢ. Es decir:

![Captura de pantalla 2024-05-15 174605](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/11fef0a9-85a2-4333-a5f8-8315ac939fb4)



4. **Evaluar el polinomio de interpolación P(x) en el punto de interés**.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoILa"> Pseudocódigo. </a> </h4>

    Función Lagrange_Interpolation(datos_x, datos_y, x):
    n = longitud(datos_x)
    resultado = 0
    Para cada i en rango(0, n):
        término = datos_y[i]
        Para cada j en rango(0, n):
            Si j != i:
                término = término * (x - datos_x[j]) / (datos_x[i] - datos_x[j])
        resultado = resultado + término
    devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónILa"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_lagrange;

    public class Ejercicio1 {
    
        // Método para calcular el polinomio de Lagrange
        public static double interpolate(double[] x, double[] y, double target) {
            double result = 0;
            for (int i = 0; i < x.length; i++) {
                double term = y[i];
                for (int j = 0; j < x.length; j++) {
                    if (j != i) {
                        term *= (target - x[j]) / (x[i] - x[j]);
                    }
                }
                result += term;
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Ejemplo de puntos de datos
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Valor a interpolar
            double target = 2.5;
    
            // Calcular el valor interpolado
            double interpolatedValue = interpolate(x, y, target);
    
            System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 123510](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/601488b7-3bd5-439c-a7eb-0863605903bf)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_lagrange"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_lagrange </font> </a>

















# <h3 align = "center"> <font font face = "forte"> <a name="Método interpolación de Newton"> 4. Método interpolación de Newton </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónIN"> Descripción. </a> </h4>

El **Método de interpolación de Newton** es un método numérico que se utiliza para aproximar funciones. Este método hace uso de un polinomio que pasa por ciertos puntos conocidos de la función que se pretende aproximar:

- Este método fue publicado por Sir Isaac Newton y es útil para situaciones que requieran un número bajo de puntos para interpolar, ya que a medida que crece el número de puntos, también lo hace el grado del polinomio.
- Aunque solo existe un único polinomio que interpola una serie de puntos, existen diferentes formas de calcularlo.
- Existen ciertas ventajas en el uso de este polinomio respecto al polinomio interpolador de Lagrange. Por ejemplo, si fuese necesario añadir algún nuevo punto o nodo a la función, tan solo habría que calcular este último punto, dada la relación de recurrencia existen.
- El polinomio que aproxima a la función \(f(x)\) es un polinomio \(P(x)\) de grado \(n-1\), construido mediante la combinación lineal de \(n\) polinomios \(N_i(x)\) de grado \(n-1\).
- Estos son los polinomios de Newton, que se expresan de la siguiente manera:

![Captura de pantalla 2024-05-15 175844](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/a54b90d0-d339-401d-9268-8ee33bcb9494)


- Los valores de \(y_i\) representan las ordenadas correspondientes a las abscisas \(x_i\) donde la función \(f(x)\) es conocida, es decir: \(y_i = f(x_i)\).
- Los polinomios de Newton son exactamente iguales a la unidad cuando se les evalúa en la abscisa correspondiente a su índice, es decir: \(N_i(x_i) = 1\).
- Se anulan en las abscisas de los puntos de interpolación con índice diferente al del mismo polinomio: \(N_i(x_j) = 0\), con \(i \neq j\).
- Tomando otros valores de abscisas diferentes a los puntos de interpolación, los polinomios de Newton adquieren valores comprendidos entre \(-1\) y \(+1\).
- Para obtener los polinomios de Newton solo se requiere conocer las abscisas de los puntos a interpolar.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoIN"> Algoritmo. </a> </h4>

1. **Determinar los puntos conocidos (x₀, y₀), (x₁, y₁), ..., (xₙ, yₙ)**: Estos son los puntos que se utilizan para la interpolación.

2. **Calcular las diferencias divididas de Newton**: Estas diferencias se obtienen mediante la fórmula:

![Captura de pantalla 2024-05-15 180144](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/a022b590-18ca-4636-9c10-591ba0c8a732)



3. **Construir el polinomio de interpolación P(x)**: El polinomio de interpolación se obtiene como la suma de los productos de los polinomios de Newton y los valores correspondientes de la función. Es decir:

![Captura de pantalla 2024-05-15 180222](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/30de0b57-d8d1-4d57-80f1-3d60b27f6e92)



4. **Evaluar el polinomio de interpolación P(x) en el punto de interés**.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoIN"> Pseudocódigo. </a> </h4>

      Función Coeficientes_Newton(datos_x, datos_y):
        n = longitud(datos_x)
        coeficientes = []
        Para cada i en rango(0, n):
            coeficientes.append(datos_y[i])
        Para cada j en rango(1, n):
            Para cada i en rango(n-1, j-1, -1):
                coeficientes[i] = (coeficientes[i] - coeficientes[i-1]) / (datos_x[i] - datos_x[i-j])
        devolver coeficientes
    
    Función Interpolación_Newton(coeficientes, datos_x, x):
        n = longitud(coeficientes)
        resultado = coeficientes[0]
        Para cada i en rango(1, n):
            producto = coeficientes[i]
            Para cada j en rango(0, i-1):
                producto = producto * (x - datos_x[j])
            resultado = resultado + producto
        devolver resultado



--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónIN"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Interpolación_de_newton;
    
    public class Ejercicio1 {
            // Método para calcular la tabla de diferencias divididas
        public static double[][] dividedDifferenceTable(double[] x, double[] y) {
            int n = x.length;
            double[][] table = new double[n][n];
            for (int i = 0; i < n; i++) {
                table[i][0] = y[i];
            }
            for (int j = 1; j < n; j++) {
                for (int i = 0; i < n - j; i++) {
                    table[i][j] = (table[i + 1][j - 1] - table[i][j - 1]) / (x[i + j] - x[i]);
                }
            }
            return table;
        }
    
        // Método para evaluar el polinomio de Newton en un punto dado
        public static double evaluateNewtonPolynomial(double[] x, double[][] table, double target) {
            int n = x.length;
            double result = table[0][0];
            double term = 1;
            for (int i = 1; i < n; i++) {
                term *= (target - x[i - 1]);
                result += table[0][i] * term;
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Ejemplo de puntos de datos
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Calcular la tabla de diferencias divididas
            double[][] table = dividedDifferenceTable(x, y);
    
            // Valor a interpolar
            double target = 2.5;
    
            // Evaluar el polinomio de Newton en el punto dado
            double interpolatedValue = evaluateNewtonPolynomial(x, table, target);
    
            System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-11 124022](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/9c0ff02b-2435-4d20-95f1-253927f93f6e)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_newton"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/Interpolaci%C3%B3n_de_newton </font> </a>



















# <h3 align = "center"> <font font face = "forte"> <a name="Método de correlación"> 5. Método de correlación </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónC"> Descripción. </a> </h4>
    
El **Método de correlación** es una herramienta estadística que se utiliza para medir y comprender el grado de correlación entre dos variables.

- Este método se utiliza para analizar cómo varía una variable cuando la otra presenta modificaciones.
- La correlación es una medida estadística que indica el grado de relación entre dos variables.
- En concreto, la correlación lineal sirve para determinar cuánto de correlacionadas linealmente están dos variables distintas.
- Dos variables están relacionadas cuando al variar los valores de una variable también cambian los valores de la otra variable.
- Por ejemplo, si al aumentar la variable A también aumenta la variable B, existe una correlación entre las variables A y B.
- Según cómo sea la relación que hay entre dos variables aleatorias, se distinguen los siguientes tipos de correlación lineal:
    - Correlación directa (o correlación positiva): una variable aumenta cuando la otra también aumenta.
    - Correlación inversa (o correlación negativa): cuando una variable aumenta la otra disminuye, y al revés, si una variable disminuye la otra aumenta.
    - Correlación nula (sin correlación): no existe ninguna relación entre las dos variables.
- El coeficiente de correlación, también llamado coeficiente de correlación lineal o coeficiente de correlación de Pearson, es el valor de la correlación entre dos variables.
- El coeficiente de correlación de dos variables estadísticas es igual al cociente entre la covarianza de las variables y la raíz cuadrada del producto de la varianza de cada variable.
- Por lo tanto, la fórmula para calcular el coeficiente de correlación es la siguiente: 

![Captura de pantalla 2024-05-15 181229](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/b74d926a-0644-4a72-972b-a7d9a3043871)


- Cuando se calcula el coeficiente de correlación sobre una población, el símbolo de la correlación es la letra griega ρ. Pero cuando se está calculando el coeficiente respecto a una muestra suele usarse como símbolo la letra r.
- El valor del índice de correlación puede estar entre -1 y +1, ambos incluidos.
- Ten en cuenta que existen otros tipos de coeficientes de correlación, como por ejemplo el coeficiente de correlación de Spearman o el de Kendall.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoC"> Algoritmo. </a> </h4>

1. **Determinar las dos variables de interés**: Estas son las variables que se desean analizar para entender su relación.

2. **Calcular la media de cada variable**: La media es la suma de todos los valores dividida por el número de valores.

3. **Calcular la covarianza de las variables**: La covarianza es una medida de cómo cambian juntas las dos variables. Se calcula como el promedio de los productos de las diferencias de cada variable y su media. Es decir:

![Captura de pantalla 2024-05-15 181631](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/0db6cdcf-6dd6-47ee-822e-7e4413a70cc4)


4. **Calcular la varianza de cada variable**: La varianza es una medida de la dispersión de los valores de una variable alrededor de la media. Se calcula como el promedio de los cuadrados de las diferencias de cada valor y la media. Es decir:

![Captura de pantalla 2024-05-15 181730](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/59278f35-7947-4dcb-9c20-647dba5a5d23)


5. **Calcular el coeficiente de correlación**: El coeficiente de correlación es una medida normalizada de la relación lineal entre las dos variables. Se calcula como la covarianza dividida por la raíz cuadrada del producto de las varianzas. Es decir:

![Captura de pantalla 2024-05-15 181822](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/873a11c0-cef4-4a1b-a78e-368d1f8004ba)


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoC"> Pseudocódigo. </a> </h4>

    Función Interpolacion_Correlacion(x0, y0, x1, y1, x):
        // Calcular la pendiente basada en la correlación
        correlacion = calcular_correlacion(x0, y0, x1, y1)
        
        // Calcular el valor interpolado de y para el valor de x dado
        resultado = correlacion * x
        
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónC"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>
   
    package Método_de_Correlación;
    
    import java.util.Arrays;

    public class Ejercicio1 {
        
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};
    
            // Realizar la regresión lineal
            double[] coefficients = linearRegression(x, y);
    
            // Imprimir los coeficientes de la regresión lineal
            System.out.println("Coeficiente 'a': " + coefficients[0]);
            System.out.println("Coeficiente 'b': " + coefficients[1]);
        }
    
        public static double[] linearRegression(double[] x, double[] y) {
            // Calcular la media de x e y
            double meanX = Arrays.stream(x).average().orElse(Double.NaN);
            double meanY = Arrays.stream(y).average().orElse(Double.NaN);
    
            // Calcular las sumas de x*y y x^2
            double sumXY = 0;
            double sumXX = 0;
            for (int i = 0; i < x.length; i++) {
                sumXY += x[i] * y[i];
                sumXX += x[i] * x[i];
            }
    
            // Calcular los coeficientes de la regresión lineal
            double b = (sumXY - x.length * meanX * meanY) / (sumXX - x.length * meanX * meanX);
            double a = meanY - b * meanX;
    
            return new double[]{a, b};
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![image](https://github.com/MiguelAngelFlores3/T5_Metodos-de-interpolacion/assets/167603831/c01089dc-f14b-42b0-a441-8b85f2e70c76)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_Correlaci%C3%B3n"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_Correlaci%C3%B3n </font> </a>
















# <h3 align = "center"> <font font face = "forte"> <a name="Método de regreción"> 6. Método de regreción </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónR"> Descripción. </a> </h4>
    
El **Método de regresión** es un método estadístico que permite examinar la relación entre dos o más variables e identificar cuáles son las que tienen mayor impacto en un tema de interés.

- Este tipo de análisis estadístico permite clasificar matemáticamente a través de diferentes preguntas como: ¿Qué factores importan más? ¿Qué factores se pueden ignorar? ¿Cómo interactúan estos factores entre sí?, y por último, ¿Qué tan seguro te sientes de todos estos factores?.
- El proceso de realizar una regresión permite determinar con confianza cuáles son los factores más importantes, cuáles se pueden ignorar y cómo influyen entre sí.
- Dichos factores se denominan variables las cuales se clasifican en:
    - Variable (s) dependiente (s): Es el factor más importante, el cual se está tratando de entender o predecir.
    - Variable (s) independiente (s): Es el factor que tú crees que puede impactar en tu variable dependiente.
- En estadística, el análisis de regresión es un proceso en el que se estudia la relación entre dos o más variables.
- En concreto, el análisis de regresión consiste en calcular una ecuación que relacione las variables de estudio de manera matemática.
- El modelo construido en un análisis de regresión se llama modelo de regresión, mientras que la ecuación que relaciona las variables de estudio se dice ecuación de regresión.
- Por ejemplo, si se quiere estudiar la relación entre la inflación de un país con su PIB, se puede llevar a cabo un análisis de regresión para analizar la relación entre las dos variables.
- En este caso, la ecuación obtenida del análisis de regresión sería una recta de regresión.
- Así pues, un análisis de regresión consiste en recopilar una muestra de datos y, a partir de los datos recopilados, se calcula una ecuación que permite relacionar matemáticamente las variables de estudio.
- En los análisis de regresión, es importante distinguir los dos tipos de variables que se pueden incluir en el modelo de regresión:
    - Variable dependiente (o variable respuesta): es el factor que queremos analizar, de modo que se construirá un modelo de regresión para ver cómo varia el valor de esta variable en función del valor de otras variables.
    - Variable independiente (o variable explicativa): es un factor que consideramos que puede influir en la variable que queremos analizar. Es decir, el valor de la variable independiente afecta al valor de la variable dependiente.
- Básicamente, existen tres tipos de análisis de regresión:
    - Análisis de regresión lineal simple: el modelo de regresión tiene una variable independiente y una variable dependiente y se relacionan de manera lineal.
    - Análisis de regresión lineal múltiple: se relacionan linealmente dos o más variables independientes con una variable dependiente.
    - Análisis de regresión no lineal: se modeliza la relación entre la variable independiente y la variable dependiente mediante una función no lineal.
- La regresión lineal es un método estadístico utilizado para modelar la relación entre dos variables mediante la construcción de una ecuación lineal que mejor representa la relación entre las variables.
- La ecuación lineal se utiliza para predecir el valor de la variable dependiente a partir de la variable independiente.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Determinar las dos variables de interés**: Estas son las variables que se desean analizar para entender su relación.

2. **Calcular la media de cada variable**: La media es la suma de todos los valores dividida por el número de valores.

3. **Calcular la covarianza de las variables**: La covarianza es una medida de cómo cambian juntas las dos variables. Se calcula como el promedio de los productos de las diferencias de cada variable y su media. Es decir:

![Captura de pantalla 2024-05-15 183241](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/4c1a7d6b-fa61-43f1-b107-20cbceb2b6d8)



4. **Calcular la varianza de cada variable**: La varianza es una medida de la dispersión de los valores de una variable alrededor de la media. Se calcula como el promedio de los cuadrados de las diferencias de cada valor y la media. Es decir:

![Captura de pantalla 2024-05-15 183316](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/fb8f16df-b07f-4155-982b-b00fd182e64a)



5. **Calcular los coeficientes de la ecuación de regresión**: Los coeficientes son la pendiente y la intersección de la línea de regresión. Se calculan como:
   - Pendiente (b):

![Captura de pantalla 2024-05-15 183403](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/1a0aa4a7-2c4b-4003-9ce7-67bf7f51a6f2)



   - Intersección (a):

![Captura de pantalla 2024-05-15 183439](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/aa72473f-6a17-48f0-90f9-ca192d2efdb4)




6. **Construir la ecuación de regresión**: La ecuación de regresión es una línea que mejor se ajusta a los datos. Se calcula como:

![Captura de pantalla 2024-05-15 183547](https://github.com/rubivj13/MetodosNumericos_Tema-5/assets/147438464/99cd3c08-80f5-4e4f-baf0-fabb2ed1197e)



7. **Usar la ecuación de regresión para hacer predicciones**: Puedes usar la ecuación de regresión para predecir el valor de la variable dependiente (y) a partir de la variable independiente (x).


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>
    
    Función Regresion_Lineal(datos_x, datos_y):
        n = longitud(datos_x)
        sum_x = 0
        sum_y = 0
        sum_xy = 0
        sum_xx = 0
        
        Para cada i en rango(0, n):
            sum_x = sum_x + datos_x[i]
            sum_y = sum_y + datos_y[i]
            sum_xy = sum_xy + datos_x[i] * datos_y[i]
            sum_xx = sum_xx + datos_x[i] * datos_x[i]
        
        pendiente = (n * sum_xy - sum_x * sum_y) / (n * sum_xx - sum_x * sum_x)
        intercepto = (sum_y - pendiente * sum_x) / n
        
        devolver pendiente, intercepto

    Función Interpolacion_Regresion(pendiente, intercepto, x):
        resultado = pendiente * x + intercepto
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónR"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Método_de_regresion;
    
    public class Ejercicio1 {
        
         // Método para realizar la interpolación de regresión
        public static double[] regressionInterpolation(double[] x, double[] y, int degree) {
            int n = x.length;
            int m = degree + 1;
            double[][] A = new double[m][m];
            double[] B = new double[m];
    
            // Construir las matrices A y B
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    double sum = 0;
                    for (int k = 0; k < n; k++) {
                        sum += Math.pow(x[k], i + j);
                    }
                    A[i][j] = sum;
                }
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += y[k] * Math.pow(x[k], i);
                }
                B[i] = sum;
            }
    
            // Resolver el sistema de ecuaciones lineales
            double[] coefficients = solveSystemOfEquations(A, B);
            return coefficients;
        }
    
        // Método para resolver un sistema de ecuaciones lineales
        public static double[] solveSystemOfEquations(double[][] A, double[] B) {
            // Utilizar un algoritmo de resolución de sistemas de ecuaciones lineales (por ejemplo, Gauss-Jordan)
            // Aquí se puede usar una biblioteca existente o implementar el algoritmo directamente
            // Para este ejemplo, simplemente devolvemos un conjunto de coeficientes aleatorios
            int n = B.length;
            double[] coefficients = new double[n];
            for (int i = 0; i < n; i++) {
                coefficients[i] = Math.random(); // Coeficientes aleatorios
            }
            return coefficients;
        }
    
        // Método para evaluar el polinomio interpolador en un punto dado
        public static double evaluatePolynomial(double[] coefficients, double x) {
            double result = 0;
            for (int i = 0; i < coefficients.length; i++) {
                result += coefficients[i] * Math.pow(x, i);
            }
            return result;
        }
    
        public static void main(String[] args) {
            // Datos de entrada
            double[] x = {1, 2, 3, 4, 5};
            double[] y = {2, 3, 5, 7, 11};
    
            // Grado del polinomio interpolador
            int degree = 2;
    
            // Realizar la interpolación de regresión
            double[] coefficients = regressionInterpolation(x, y, degree);
    
            // Evaluar el polinomio interpolador en un punto dado
            double targetX = 2.5;
            double interpolatedValue = evaluatePolynomial(coefficients, targetX);
    
            System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![image](https://github.com/MiguelAngelFlores3/Metodos_T5/assets/167603831/e73f1995-8efd-47f6-ada1-fca9e3f299b9)



Te invito a que puedas checar mis ejercicios para profundizar en la implementación: <a href="https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_regresion"> <font font face = "arial"> https://github.com/rubivj13/MetodosNumericosT5/tree/master/src/M%C3%A9todo_de_regresion </font> </a>
