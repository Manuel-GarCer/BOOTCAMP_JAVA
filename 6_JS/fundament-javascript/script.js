
console.log("Hola chicas y chicos de CodiGo")


// Variables
// var, let, const

// hoisting
console.log(a)

var a = "Hola"

console.log(a)
// a = "Adios"

// a = 10

// a = true

// a = null

// console.log(b)
// let b = "Adios"

// console.log(b)

// b = "Hola"


// console.log(a,b)


let texto = "Hola"
let numero = 10
let decimal = 10.5
let booleano = true
let nulo = null
let indefinido = undefined
let array = []
let objeto = {}


 let suma = '10' + 10

 console.log(suma)


 // constantes


  const PI = 3.1416
  const MINOMBRE = "Josue"

  const EDAD = 20


  // Operadores aritmeticos

  let num1 = 10
  let num2 = 20

  let suma1 = num1 + num2
  let resta = num1 - num2
  let multiplicacion = num1 * num2
  let division = num1 / num2
  let residuo = num1 % num2


  let miDivison = 10 / 3
  console.log(miDivison)

  let miResiduo = 10 % 3
  console.log(miResiduo)

  let miPotencia = 10 ** 3

  let array1 = [1,2,3,4,5,6,7,8,9,10]
  let arrayStrings = ["Hola", "Mundo", "CodiGo", "Bootcamp"]
  let verdades = [true, false, false, true, true]


  // for (let indice = 0; indice < array1.length; indice++) {
  //     console.log(array1[indice])
  // }


  let objeto1 = {
    nombre: "Josue",
    apellido: "Cando",
    edad: 20,
    casado: false,
    hijos: null,
    mascota: {
      nombre: "Cachetes",
      edad: 2
    }
  }


  if (objeto1.edad > 18) {
    console.log("Es mayor de edad")
  }else if (objeto1.edad === 18) {
    console.log("Tiene 18 años") 
  }else{
    console.log("Es menor de edad")
  }


  if ('1' === 1) {
    console.log("Son iguales")
  }else{
    console.log("No son iguales")
  }