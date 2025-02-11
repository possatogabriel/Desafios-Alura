let escolha = prompt("Escolha um exercício/desafio (1 a 4): ");

if (escolha == 1) {
    // 2. Altere o conteúdo da tag h1 com document.querySelector e atribua o seguinte texto: Hora do Desafio.

    let titulo = document.querySelector("h1");
    titulo.textContent = "(2) Hora do Desafio";

    // 3. Crie uma função que exiba no console a mensagem O botão foi clicado sempre que o botão Console for pressionado.

    function clicarConsole() {
        console.log("(3) O botão foi clicado!");
    }
    
    // 4. Crie uma função que exiba um alerta com a mensagem: Eu amo JS, sempre que o botão Alerta for pressionado.

    function clicarAlerta() {
        alert("(4) Eu amo JS!");
    }
    
    // 5. Crie uma função que é executada quando o botão prompt é clicado, perguntando o nome de uma cidade do Brasil. Em seguida, exiba um alerta com a mensagem concatenando a resposta com o texto: Estive em {cidade} e lembrei de você.

    function clicarPrompt() {
        let nomeCidade = prompt("(5) Escreva o nome de uma cidade do Brasil: ");
        alert("(5) Estive em " + nomeCidade + " e lembrei de você.");
    }
    
    // 6. Ao clicar no botão soma, peça 2 números inteiros e exiba o resultado da soma em um alerta.

    function clicarSoma() {
        let numero1 = parseInt(prompt("(6) Escreva o número 1: "));
        let numero2 = parseInt(prompt("(6) Escreva o número 2: "));
    
        let soma = numero1 + numero2;
        alert("(6) O resultado da soma é: " + soma);
    }
}

else if (escolha == 2) {
    // 1. Criar uma função que exibe "Olá, mundo!" no console.

    function exibirConsole() {
        console.log("(1) Olá, mundo!");
    }

    exibirConsole();

    // 2. Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

    function exibirNome(nome) {
        console.log("(2) Olá, " + nome + "!");
    }

    exibirNome("Gabriel");

    // 3. Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

    function retornarValorDobrado(numero) {
        return numero * 2;
    }    

    let valorDobrado = retornarValorDobrado(2);
    console.log("(3) O VALOR DOBRADO É: " + valorDobrado);

    // 4. Criar uma função que recebe três números como parâmetros e retorna a média deles.

    function retornarMedia(numero1, numero2, numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

    let media = retornarMedia(3, 3, 3);
    console.log("(4) A MÉDIA É: " + media);

    // 5. Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

    function retornarMaiorNumero(numero1, numero2) {
       return numero1 > numero2 ? numero1 : numero2;
    }

    let maiorNumero = retornarMaiorNumero(8, 11);
    console.log("(5) O MAIOR NÚMERO É: " + maiorNumero);

    // 6. Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo

    function retornarAoQuadrado(numero1) {
        return numero1 * numero1;
    }

    let numeroAoQuadrado = retornarAoQuadrado(5);
    console.log("(6) O NÚMERO AO QUADRADO É: " + numeroAoQuadrado);
}

else if (escolha == 3) {
    // 1. Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

    function calcularIMC(peso, altura) {
        return peso / (altura * altura);
    }

    let IMC = calcularIMC(50, 1.9);
    console.log("(1) O IMC É: " + IMC);

    // 2. Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

    function calcularFatorial(numero1) {
        let valor = 1;
        let valorFinal;
        let i;

        for (i = numero1; i > 0; i--) {
            valor = valor * i;

            if (i == 1) {
                console.log("(2) O VALOR DA FATORIAL É: " + valor);
            }
        }
    }
    calcularFatorial(5);

    // 3. Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

    function converterParaDolar(valor) {
        return valor * 4.80;
    }

    let valorEmReais = converterParaDolar(10);
    console.log("(3) O VALOR EM DÓLAR CONVERTIDO PARA REAIS É DE: " + valorEmReais);


    // 4. Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.

    function calcularAreaPerimetroRetangular(altura, largura) {
        let perimetro;
        let area;

        perimetro = (altura * 2) + (largura * 2)
        area = altura * largura;

        alert("(4) A ÁREA DO RETÂNGULO É: " + area + " E O PERÍMETRO (o lugar que não existe) É: " + perimetro);
    }

    calcularAreaPerimetroRetangular(5, 10);

    // 5. Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.

    function calcularAreaPerimetroCircular(raio) {
        let perimetro;
        let area;

        perimetro = 3.14 * 2 * raio;
        area = 3.14 * (raio * raio);

        alert("(5) A ÁREA DA CIRCUNFERÊNCIA É: " + area + " E O PERÍMETRO (o lugar que não existe) É: " + perimetro);
    }

    calcularAreaPerimetroCircular(3);

    // 6. Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.

    function calcularTabuada(valor) {
        let i;

        for (i = 1; i < 11; i++) {
            let tabuada = valor * i;
            console.log("(6) " + valor + " * " + i + " = " + tabuada);
            tabuada = 0;
        }
    }
    calcularTabuada(10);
}

else if (escolha == 4) {
    // 1. Crie uma lista vazia, com o nome listaGenerica.

    let listaGenerica = [];

    // 2. Crie uma lista de linguagens de programação chamada linguagensDeProgramacao com os seguintes elementos: 'JavaScript','C','C++', 'Kotlin' e 'Python'.

    let linguagensDeProgramacao = ['JavaScript', 'C', 'C++', 'Kotlin', 'Python'];

    // 3. Adicione à lista linguagensDeProgramacao os seguintes elementos: 'Java', 'Ruby' e 'GoLang'.

    linguagensDeProgramacao.push('Java', 'Ruby', 'GoLang');

    // 4. Crie uma lista com 3 nomes e exiba no console apenas o primeiro elemento.

    let listaDeNomes = ["Mia", "Veríssimo", "Desassombrado"];
    console.log("(4) PRIMEIRO NOME: " + listaDeNomes[0]);

    // 5. Crie uma lista com 3 nomes e exiba no console apenas o segundo elemento.

    console.log("(5) SEGUNDO NOME: " + listaDeNomes[1]);

    // 6. Crie uma lista com 3 nomes e exiba no console apenas o último elemento.

    console.log("(6) TERCEIRO NOME: " + listaDeNomes[2]);
}

else {
    alert("Ocorreu um erro. Tente novamente!");
}
