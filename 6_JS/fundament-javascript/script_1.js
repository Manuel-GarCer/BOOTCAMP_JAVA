// VARIABLES
let miVariable = 10;
console.log( miVariable );

// TIPOS DE DATOS
// String
let miString = "Hola Mundo";
console.log( miString );

// Number
let miNumber = 10;
console.log( miNumber );

// Boolean
let miBoolean = true;
console.log( miBoolean );

// Array
let miArray = [ 1, 2, 3, 4, 5 ];
console.log( miArray );

// Object
let miObject = {
  nombre: "Juan",
  apellido: "Perez",
  edad: 30,
};

console.log( miObject );

// OPERADORES

// Aritmeticos
let suma = 10 + 5;
console.log( suma );

let resta = 10 - 5;
console.log( resta );

let multiplicacion = 10 * 5;
console.log( multiplicacion );

let division = 10 / 5;
console.log( division );

let modulo = 10 % 5;
console.log( modulo );


// Incremento
let incremento = 10;
incremento++;

incremento = incremento + 5;
incremento *= 5;
incremento /= 5;
incremento -= 5;

console.log( incremento );

// Decremento 
let decremento = 10;
decremento--;


// Strings

let miString1 = "12";
let miString2 = "Mundo 123";

let miString3 = miString1 + " " + miString2;
console.log( miString3 );

let saludo = "Hola";
let nombre = "Juan";

// interpolacion de strings
let saludoCompleto = `${saludo} | ${nombre}`;
console.log( saludoCompleto );

let learnCoding = `How to start learning web development?
- Learn HTML
- Learn CSS
- Learn JavaScript
Use freeCodeCamp to learn all the above and much, much more !`;

console.log( learnCoding[ 0 ] );


// Arrays

let miArray1 = [ 1, 2, 3, 4, 5 ];
let valor1 = miArray1[ 0 ];
let valor2 = miArray1[ 1 ];
let valor3 = miArray1[ 2 ];
let valor4 = miArray1[ 3 ];
let valor5 = miArray1[ 4 ];

let miArray2 = [ "Hola", "Mundo" ];
let miArray3 = [ 1, "Hola", true ];

let notas = [ 10, 8, 9, 7, 6, 10, 8, 9, 7, 6, 10, 8, 9, 7, 6, 10, 8, 9, 7, 6 ];
let listaDeEstudiantes = [ "Juan", "Maria", "Pedro", "Jose" ];

let capitalesDelMundo = [
  "Buenos Aires",
  "Brasilia",
  "Santiago de Chile",
  "Bogota",
  "Caracas",
  "Montevideo",
  "Lima",
  "Quito",
];

console.log( capitalesDelMundo[ 0 ] );

// json
// Objetos

let miObjeto = {
  nombre: "Juan",
  apellido: "Perez",
  edad: 30,
  hobbies: {
    musica: [ "rock", "reggae", "blues" ],
    deportes: [ "futbol", "basquet", "natacion" ],
    artistico: {
      pintura: [ "oleo", "acrilico", "tinta china" ],
      escultura: [ "mad era", "piedra", "metal" ],
    },
  }
};



const { apellido, edad } = miObjeto;

const { musica, deportes } = miObjeto.hobbies;

const { pintura, escultura } = miObjeto.hobbies.artistico;


// bucles

// for

// c-style
for ( let i = 0; i < 10; i++ ) {
  console.log( i );
}

// for of
for ( let cancion of musica ) {
  console.log( cancion );
}

// for in
for ( let propiedad in miObjeto ) {
  console.log( propiedad );
}

// for vs for of vs for in
let miArray4 = [ true, 'valor1', 3, null, undefined ];

for ( let i = 0; i < miArray4.length; i++ ) {
  console.log( miArray4[ i ] );
}

for ( let valor of miArray4 ) {
  console.log( 'for of', valor );
}

for ( let indice in miArray4 ) {
  console.log( 'for in', indice );
}


// while

let i = 0;

// while ( i < 10 ) {
//   console.log( i );
//   i++;
// }


let numeroAleatorio = Math.random() * 100;
let numeroDeIntentos = 0;

// while(true){
//   numeroDeIntentos++;
//   if(numeroAleatorio > 50 && numeroAleatorio < 60){
//     break;
//   }
//   numeroAleatorio = Math.random() * 100;
// }

// console.log('numero de intentos', numeroDeIntentos );

// console.log( numeroAleatorio );

// do while 

// let j = 0;

// do {
//   console.log( 'j',j );
//   j++;
// } while ( j < 10 && j == 1000 );

// condicionales

// if
let miNumero = 10;

if ( miNumero > 10 ) {
  console.log( 'es mayor a 10' );
} else if ( miNumero < 10 ) {
  console.log( 'es menor a 10' );
} else {
  console.log( 'es igual a 10' );
}

// break vs continue
console.log( 'break vs continue' );

// break
console.log( '#########break#########' );
for ( let i = 0; i < 10; i++ ) {
  if ( i == 5 ) {
    break;
  }
  console.log( i );
}
console.log( '#########break#########' );


// continue
console.log( '--------continue--------' )
for ( let i = 0; i < 10; i++ ) {
  if ( i == 5 ) {
    continue;
  }
  console.log( i );
}
console.log( '--------continue--------' )

let numeroEnteroAleatorio = 0
let numeroDeIntentos2 = 0;
while ( true ) {
  numeroEnteroAleatorio = Math.floor( Math.random() * 100 );
  if ( numeroEnteroAleatorio > 50 && numeroEnteroAleatorio < 60 ) {
    numeroDeIntentos2++;
    console.log( 'numero aleatorio', numeroEnteroAleatorio, 'numero de intentos', numeroDeIntentos2 );
    break;
  } else if ( numeroAleatorio > 60 ) {
    numeroDeIntentos2++;
    console.log( numeroAleatorio, 'es mayor a 60' );
  } else {
    numeroDeIntentos2++;
    console.log( numeroAleatorio, 'es menor a 50' );
  }
}

// switch

let miNumero2 = Math.floor( Math.random() * 100 );

switch ( miNumero2 ) {
  case miNumero2 > 10:
    console.log( 'es menor a 10' );
    break;
  case miNumero2 > 20:
    console.log( 'es menor a 10 y 20' );
    break;
  default:
    console.log( 'no es igual a 10 ni a 20' );
    break;
}


console.log( miVariableHoisting )

var miVariableHoisting = 10

console.log( miVariableHoisting )

// function miFuncion() {
//   console.log( 'mi funcion1' , miEdad);
//  let miEdad = 30;
//   console.log( 'mi funcion2' , miEdad);
// }

// miFuncion();

//console.log( miEdad );


//filter

let miArray5 = [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ];

let miArrayFiltrado = miArray5.filter( function ( valor, indice, array ) {
  return valor > 5;
}
);

let miArrayFiltrado2 = miArray5.filter( elemento => elemento > 5 && elemento % 2 == 0 );

let miArrayDeAlumnos = [
  {
    nombre: "Juan",
    edad: 30,
    fechaDeNacimiento: "1990-01-01",
  },
  {
    nombre: "Maria",
    edad: 20,
    fechaDeNacimiento: "2000-01-01",
  },
  {
    nombre: "Pedro",
    edad: 25,
    fechaDeNacimiento: "1995-01-01",
  },
  {
    nombre: "Jose",
    edad: 35,
    fechaDeNacimiento: "1985-01-01",
  },
];

let miArrayDeAlumnosFiltrado = miArrayDeAlumnos.filter( ( { edad } ) => edad > 25 );


let filtrarPorEdad = ( edad ) => {
  return miArrayDeAlumnos.filter( ( { edad } ) => edad > 25 );
}


let filtradoXedad = miArrayDeAlumnos.filter( ( alumno ) => {
  let fecha = new Date( alumno.fechaDeNacimiento );
  let fechaActual = new Date();
  let edad = fechaActual.getFullYear() - fecha.getFullYear();
  return edad > 25;
} )

console.log( 'Filtrado por edad', filtradoXedad );


// let recorrrerFiltradoXedadConForEach = filtradoXedad.forEach( ( alumno ) => {
//   console.log( alumno.nombre );
// } 
// );


let recorrrerFiltradoXedadConMap = filtradoXedad.map( ( alumno ) => {
  return alumno.nombre;
}
);

// Funciones

function miFuncion() {
  console.log( 'mi funcion' );
}

const miFuncion2 = function ( params ) {
  console.log( 'mi funcion 2' );
}

const miFuncion3 = ( param1, param2 ) => {
  console.log( 'mi funcion 3' );
}



let paises = [
  {
    nombre: "Argentina",
    continente: "America",
    poblacion: 40000000,
  },
  {
    nombre: "Brasil",
    continente: "America",
    poblacion: 300000000,
  },
  {
    nombre: "China",
    continente: "Asia",
    poblacion: 1500000000,
  },
  {
    nombre: "Estados Unidos",
    continente: "America",
    poblacion: 350000000,
  },
  {
    nombre: "Francia",
    continente: "Europa",
    poblacion: 67000000,
  },
  {
    nombre: "Italia",
    continente: "Europa",
    poblacion: 60000000,
  },
  {
    nombre: "Japon",
    continente: "Asia",
    poblacion: 126000000,
  },
  {
    nombre: "Uruguay",
    continente: "America",
    poblacion: 3400000,
  },
];

//closure
let lasAmericas = paises.filter( ( pais ) => {
  return pais.continente == "America";
} )

let lasAmericas2 = paises.filter( ( { continente } ) => {
  return continente == "America";
} )

let lasAmericas3 = paises.filter( ( { continente } ) => continente == "America" )


let paisesAmericanos = lasAmericas.map( ( pais ) => {
  return `${pais.nombre} - ${pais.poblacion}`;
} )

console.log( 'lasAmericas', lasAmericas );

for ( const paises of paisesAmericanos ) {
  console.log( paises );
}