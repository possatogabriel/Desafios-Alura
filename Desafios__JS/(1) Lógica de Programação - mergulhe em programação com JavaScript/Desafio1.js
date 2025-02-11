let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 9): ");

if (escolha == 1) {
    // 1. Mostre um alerta com a mensagem "Boas vindas ao nosso site!"

    alert("(1) Boas vindas ao nosso site!");
}
    
else if (escolha == 2) {
    // 2. Declare uma variável chamada nome e atribua a ela o valor "Lua"

    let nome = "Lua";
    console.log("(2) VALOR DA VARIÁVEL NOME: " + nome);
}

else if (escolha == 3) {
    // 3. Crie uma variável chamada idade e atribua a ela o valor 25

    let idade = 25;
    console.log("(3) VALOR DA VARIÁVEL IDADE: " + idade);
}

else if (escolha == 4) {
    // 4. Defina uma variável numeroDeVendas e atribua a ela o valor 50

    let numeroDeVendas = 50;
    console.log("(4) VALOR DA VARIÁVEL DO NÚMERO DE VENDAS: " + numeroDeVendas);
}

else if (escolha == 5) {
    // 5. Defina uma variável saldoDisponivel e atribua a ela o valor 1000

    let saldoDisponivel = 1000;
    console.log("(5) VALOR DA VARIÁVEL DO SALDO DISPONÍVEL: " + saldoDisponivel);
}

else if (escolha == 6) {
    // 6. Exiba um alerta com o texto "Erro! Preencha todos os campos"

    alert("(6) Erro! Preencha todos os campos.");
}

else if (escolha == 7) {
    // 7. Declare uma variável chamada mensagemDeErro e atribua a ela o valor "Erro! Preencha todos os campos" Agora exiba um alerta com o valor da variável mensagemDeErro

    let mensagemDeErro = "(7) Erro! Preencha todos os campos. (VERSÃO DA VARIÁVEL)";
    alert(mensagemDeErro);
}

else if (escolha == 8) {
    // 8. Use um prompt para perguntar o nome do usuário e armazená-lo na variável nome
    
    let nomePergunta = prompt("(8) Escreva o nome: ");
    console.log("NOME INSERIDO NO PROMPT: " + nomePergunta);
}

else if (escolha == 9) {
    // 9. Peça ao usuário para digitar sua idade usando um prompt e armazene-a na variável idade

    let idade = prompt("(9) Escreva a idade: ");

    // 10. Agora, caso a idade seja maior ou igual que 18, exiba um alerta com a mensagem "Pode tirar a habilitação!"

    if (idade >= 18) {
        alert("(10) Pode tirar a habilitação!");
    }
    
    else {
        alert("(10) Ainda não pode tirar habilitação!");
    }
}

else {
    alert("Ocorreu um erro. Tente novamente! ");
}
