let escolha = prompt("Escolha um desafio/exercício para vizualizar (2 a 6): ");

if (escolha == 2) {
    // 3. Crie um programa que verifica se uma palavra ou frase é um palíndromo.

    function verificarPalindromo() {
        let palavra = prompt("(3) Escreva uma palavra: ");
        palavra = palavra.toUpperCase();

        let palavraSeparada = palavra.split("");

        let palavraInvertida = palavraSeparada.reverse();
        palavraInvertida = palavraInvertida.join("");

        if (palavra == palavraInvertida) {
            alert("(3) A palavra inserida É um palíndromo!");
        }

        else {
            alert("(3) A palavra inserida NÃO É um palíndromo!");
        }
    }

    verificarPalindromo();

    // 4. Crie um programa com uma função que receba três números como argumentos e os retorne em ordem crescente. Exiba os números ordenados.
    
    let array = [];

    let numero1 = prompt("(4) Insira o número 1: ");
    let numero2 = prompt("(4) Insira o número 2: ");
    let numero3 = prompt("(4) Insira o número 3: ");

    function exibirNumerosOrdenados(n1, n2, n3) {
        array.push(numero1);
        array.push(numero2);
        array.push(numero3);

        array.sort(function(a, b) {
            return a - b;
        });

        console.log(`(4) NÚMEROS EM ORDEM CRESCENTE: ${array}`);
    }

    exibirNumerosOrdenados(numero1, numero2, numero3);
}

else if (escolha == 3) {
    // 2. Crie um formulário simples com campos de entrada e utilize JavaScript para recuperar os valores digitados nos campos usando a propriedade value. Exiba os valores no console e na tela.

    function mostrarInput() {
        let input = document.getElementById('inputHTML');
        console.log("(2) " + inputHTML.value);
    }

    // 3. Tenha um elemento HTML na página (por exemplo, um parágrafo) e utilize JavaScript para modificar seu conteúdo usando a propriedade textContent.
    
    let paragrafo = document.getElementById('paragrafo');
    paragrafo.textContent = "(3) Agora isso é um texto que coloquei pelo meu JS!";

    // 4. Faça a soma de duas variáveis numéricas e apresente no console com uma mensagem amigável em Template String.
    
    let n1 = 10;
    let n2 = 24;
    let resultado = n1 + n2;

    let mensagem = `(4) Olá! A soma dos números ${n1} e ${n2} resultam em: ${resultado}!`;
    console.log(mensagem);

    // 5. Receba, no mínimo, duas sentenças como uma string e utilize split() para quebrá-la em frases menores com base em um ponto e vírgula como delimitador.
    
    let fraseInteira = "O Medo é impossível. ; O Medo é infinito."

    let fraseSeparada = fraseInteira.split(";");
    console.log('(5) FRASE 1: ' + fraseSeparada[0]);
    console.log('(5) FRASE 2: ' + fraseSeparada[1]);

    // 6. Receba uma string contendo números separados por vírgulas. Utilize split() para separar os números e exibi-los no console.
    
    let numeros = "10, 20, 30, 40, 50, 60, 70, 80, 90, 100";
    console.log(numeros);

    let numerosSeparados = numeros.split(",");

    for (let i = 0; i < numerosSeparados.length; i++) {
        console.log("(6) " + numerosSeparados[i]);
    }
}

else if (escolha == 4) {
    // 2. Crie uma função que aceite uma string como parâmetro, utilize a função parseInt para converter essa string em um número inteiro e retorne o resultado.

    let texto = prompt("(2) Escreva um número: ");

    function converterParaInt(string) {
        let int = parseInt(string);
        console.log("(2) " + int);
    }
    
    converterParaInt(texto);

    // 3. Escreva um programa de calculadora simples com funções separadas para adição, subtração, multiplicação e divisão. Utilize um bloco condicional para determinar qual função executar com base em uma variável que representa a operação desejada.

    let numero1 = parseInt(prompt("(3) Escreva o número 1: "));
    let numero2 = parseInt(prompt("(3) Escreva o número 2: "));

    let escolhaOperacao = prompt("(3) Escreva a operação matemática que você quer usar: ");
    escolhaOperacao = escolhaOperacao.toUpperCase();

    if (escolhaOperacao == "SOMA") {
        fazerSoma(numero1, numero2);
    }

    else if (escolhaOperacao == "SUBTRAÇÃO") {
        fazerSub(numero1, numero2);
    }
    
    else if (escolhaOperacao == "MULTIPLICAÇÃO") {
        fazerMult(numero1, numero2);
    }

    else if (escolhaOperacao == "DIVISÃO") {
        fazerDivisao(numero1, numero2);
    }
    
    else {
        alert("Houve um erro.");
    }

    function fazerSoma(n1, n2) {
        let resultado = n1 + n2;
        console.log("(3) " + resultado);
    }

    function fazerSub(n1, n2) {
        let resultado = n1 - n2;
        console.log("(3) " + resultado);
    }

    function fazerMult(n1, n2) {
        let resultado = n1 * n2;
        console.log("(3) " + resultado);
    }   

    function fazerDivisao(n1, n2) {
        let resultado = n1 / n2;
        console.log("(3) " + resultado);
    }

    // 4. Implemente uma função que aceite um número como parâmetro e utilize um bloco condicional para determinar se o número é par ou ímpar.

    let numero = prompt("(4) Escreva um número para determinar se é par ou ímpar: ");
 
    function verificarParImpar(n1) {
        if (n1 % 2 == 0) {
            console.log("(4) PAR!");
        }

        else {
            console.log("(4) ÍMPAR!");
        }
    }

    verificarParImpar(numero);

    // 5. Crie uma função que converta a temperatura de Celsius para Fahrenheit e vice-versa. Utilize uma variável para indicar a escala desejada e um bloco condicional para determinar qual conversão realizar

    let tipo = prompt("(5) Escolha se a temperatura vai ser convertida PARA celsius ou fahrenheit: ");
    let temp = prompt("(5) Escreva a temperatura: ");

    if (tipo.toUpperCase() == "CELSIUS") {
        let fahrenheit = 1.8 * temp + 32;
        console.log("(5) EM FAHRENHEIT: " + fahrenheit);
    }

    else {
        let celsius = temp - 32 / 1.8;
        console.log("(5) EM CELSIUS: " + celsius)
    }
}

else if (escolha == 5) {
    // 2. Adicione os números 1,2,3 em uma variável chamada minhaLista e armazene os números 4, 5 e 6 separadamente em outra variável. Use o método concat() para combinar as sequências de valores em uma nova lista chamadanovaLista. Imprima novaLista no console.

    const minhaLista = ['1', '2', '3'];
    console.log("(2) " + minhaLista);

    const novaLista = ['4', '5', '6'];
    console.log("(2) " + novaLista);

    const listaFinal = minhaLista.concat(novaLista);
    console.log("(2) " + listaFinal);

    // 3. Remova o último elemento de novaLista. Imprima novaLista após a remoção.

    novaLista.pop();
    console.log("(3) " + novaLista);

    // 4. Utilize o algoritmo de Fisher-Yates (também conhecido como Knuth Shuffle) para embaralhar os elementos em novaLista. Pesquise e adapte o código para realizar o embaralhamento.

    function embaralha(lista) {

        for (let indice = lista.length; indice; indice--) {
    
            const indiceAleatorio = Math.floor(Math.random() * indice);
    
            // atribuição via destructuring
            [lista[indice - 1], lista[indiceAleatorio]] = 
                [lista[indiceAleatorio], lista[indice - 1]];
        }
    }

    embaralha(listaFinal);
    console.log("(4) " + listaFinal);

    // 5. Crie uma função chamada removerDuplicatas que aceita um array como parâmetro e retorna um novo array sem elementos duplicados. Teste a função com novaLista e imprima o array resultante.

    function removerDuplicatas(array) {
        return [...new Set(array)];
    }

    let novaListaSemDuplicatas = removerDuplicatas(novaLista);
    console.log("(5) " + novaListaSemDuplicatas);
}

else if (escolha == 6) {
    // 1. Crie uma função que valide se um número é positivo, negativo ou zero.

    let numero = prompt("(1) Escreva um número: ");

    function validarNumeros(n1) {
        if (numero > 0) {
            console.log("(1) NÚMERO POSITIVO!");
        }

        else if (numero < 0) {
            console.log("(1) NÚMERO NEGATIVO!");
        }

        else {
            console.log("(1) ZERO!");
        }
    }

    validarNumeros(numero);
    // 2. Implemente uma função que verifique se uma pessoa é maior de idade.

    let idade = prompt("(2) Escreva sua idade: ");

    function verificarMaioridade(age) {
        if (age >= 18) {
            console.log("(2) MAIOR DE IDADE!")
        }

        else {
            console.log("(2) MENOR DE IDADE!")
        }
    }

    verificarMaioridade(idade);
    // 3. Desenvolva uma função que valide se uma string é vazia ou não.

    let texto = prompt("(3) Escreva algo: ");

    function verificarVazio(string) {
        if (string == "") {
            console.log("(3) A string está vazia.");
        }

        else {
            console.log("(3) Você digitou: " + string);
        }
    }

    verificarVazio(texto);
    // 4. Crie uma função que determine se um ano é bissexto

    let anoEmDias = 366; 

    function verificarAnoBissexto(ano) {
        if (ano > 365) {
            console.log("(4) Ano bissexto!");
        }

        else {
            console.log("(4) Ano normal!");
        }
    }

    verificarAnoBissexto(anoEmDias);
    // 5. Implemente uma função que calcule a média de dois números, interrompendo a execução se algum dos números não for válido.

    let numero1 = 12;
    let numero2 = 8;

    function calcularMedia(n1, n2) {
        if (n1 <= 0 || n2 <= 0) {
            console.log("(5) O número inserido é inválido! Tente novamente.");
            return;
        }
        let media = (n1 + n2) / 2;
        console.log("(5) Média: " + media);
    }

    calcularMedia(numero1, numero2);
    // 6. Desenvolva uma função que receba um array como parâmetro e retorne o seu tamanho.

    let array1 = [1, 2, 3, 4, 5];
    let array2 = [1, 2];

    function exibirTamanhoArray(array) {
        console.log("(6) TAMANHO DO ARRAY ESCOLHIDO: " + array.length);
    }

    exibirTamanhoArray(array1);
    // 7. Crie um array e utilize a função includes para verificar se um elemento específico está presente

    let arrayCom324 = [1, 2, 324, 3, 4];

    function verificarArray(array) {
        if (array.includes(324)) {
            console.log("(7) O ARRAY INCLUI O NÚMERO 324!");
        } else {
            console.log("(7) O ARRAY NÃO INCLUI O NÚMERO 324!");
        }
    } 

    verificarArray(arrayCom324);
    // 8 Implemente uma função que receba um array e um elemento, e retorne se o elemento está presente no array.
    // 9. Crie um array de strings e utilize includes para verificar se uma determinada string está presente.

    let elementos = ["Sangue", "Morte", "Energia", "Conhecimento", "MEDO"];

    function estaNoArray(array, elemento) {
        if (array.includes(elemento)) {
            console.log("(8/9) O ARRAY INCLUI O ELEMENTO 'MEDO'!");
        } else {
            console.log("(8/9) O ARRAY NÃO INCLUI O ELEMENTO!");
        }
    }

    estaNoArray(elementos, "MEDO");
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}

