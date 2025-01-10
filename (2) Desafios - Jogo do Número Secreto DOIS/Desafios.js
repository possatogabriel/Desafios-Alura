let escolha = prompt("Escolha um exercício/desafio (1 a 4): ");

if (escolha == 1) {
// 1.
    function clicarConsole() {
        console.log("O botão foi clicado!");
    }
    
// 2.
    function clicarAlerta() {
        alert("Eu amo JS!");
    }
    
// 3.
    function clicarPrompt() {
        let nomeCidade = prompt("Escreva o nome de uma cidade do Brasil: ");
        alert("Estive em " + nomeCidade + " e lembrei de você.");
    }
    
// 4.
    function clicarSoma() {
        let numero1 = parseInt(prompt("Escreva o número 1: "));
        let numero2 = parseInt(prompt("Escreva o número 2: "));
    
        let soma = numero1 + numero2;
        alert("O resultado da soma é: " + soma);
    }
}

else if (escolha == 2) {
// 1.
    function exibirConsole() {
        console.log("Olá, mundo!");
    }

    exibirConsole();

// 2.
    function exibirNome(nome) {
        console.log("Olá, " + nome + "!");
    }

    exibirNome("Gabriel");

// 3.
    function retornarValorDobrado(numero) {
        return numero * 2;
    }    

    let valorDobrado = retornarValorDobrado(2);
    console.log("O VALOR DOBRADO É: " + valorDobrado);

// 4.
    function retornarMedia(numero1, numero2, numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

    let media = retornarMedia(3, 3, 3);
    console.log("A MÉDIA É: " + media);

// 5.
    function retornarMaiorNumero(numero1, numero2) {
       return numero1 > numero2 ? numero1 : numero2;
    }

    let maiorNumero = retornarMaiorNumero(8, 11);
    console.log("O MAIOR NÚMERO É: " + maiorNumero);

// 6.
    function retornarAoQuadrado(numero1) {
        return numero1 * numero1;
    }

    let numeroAoQuadrado = retornarAoQuadrado(5);
    console.log("O NÚMERO AO QUADRADO É: " + numeroAoQuadrado);

}

else if (escolha == 3) {
// 1.
    function calcularIMC(peso, altura) {
        return peso / (altura * altura);
    }

    let IMC = calcularIMC(50, 1.9);
    console.log("O IMC É: " + IMC);

// 2.
    function calcularFatorial(numero1) {
        let valor = 1;
        let valorFinal;
        let i;

        for (i = numero1; i > 0; i--) {
            valor = valor * i;

            if (i == 1) {
                console.log("O VALOR DA FATORIAL É: " + valor);
            }
        }
    }
    calcularFatorial(5);

// 3.
    function converterParaDolar(valor) {
        return valor * 4.80;
    }

    let valorEmReais = converterParaDolar(10);
    console.log("O VALOR EM DÓLAR CONVERTIDO PARA REAIS É DE: " + valorEmReais);


// 4.
    function calcularAreaPerimetroRetangular(altura, largura) {
        let perimetro;
        let area;

        perimetro = (altura * 2) + (largura * 2)
        area = altura * largura;

        alert("A ÁREA DO RETÂNGULO É: " + area + " E O PERÍMETRO (o lugar que não existe) É: " + perimetro);
    }

    calcularAreaPerimetroRetangular(5, 10);

// 5.
    function calcularAreaPerimetroCircular(raio) {
        let perimetro;
        let area;

        perimetro = 3.14 * 2 * raio;
        area = 3.14 * (raio * raio);

        alert("A ÁREA DA CIRCUNFERÊNCIA É: " + area + " E O PERÍMETRO (o lugar que não existe) É: " + perimetro);
    }

    calcularAreaPerimetroCircular(3);

// 6.
    function calcularTabuada(valor) {
        let i;

        for (i = 1; i < 11; i++) {
            let tabuada = valor * i;
            console.log(valor + " * " + i + " = " + tabuada);
            tabuada = 0;
        }
    }
    calcularTabuada(10);
}

else if (escolha == 4) {
// 1.
    let listaGenerica = [];

// 2.
    let linguagensDeProgramacao = ['JavaScript', 'C', 'C++', 'Kotlin', 'Python'];

// 3.
    linguagensDeProgramacao.push('Java', 'Ruby', 'GoLang');

// 4.
    let listaDeNomes = ["Mia", "Veríssimo", "Desassombrado"];
    console.log("PRIMEIRO NOME: " + listaDeNomes[0]);

// 5.
    console.log("SEGUNDO NOME: " + listaDeNomes[1]);

// 6.
    console.log("TERCEIRO NOME: " + listaDeNomes[2]);
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
