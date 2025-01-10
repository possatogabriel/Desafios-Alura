let escolha = prompt("Escolha um exercício/desafio para visualizar (1 a 9): ");

if (escolha == 1) {
    alert("Boas vindas ao nosso site!");
}
    
else if (escolha == 2) {
    let nome = "Lua";
    console.log("VALOR DA VARIÁVEL NOME: " + nome);
}

else if (escolha == 3) {
    let idade = 25;
    console.log("VALOR DA VARIÁVEL IDADE: " + idade);
}

else if (escolha == 4) {
    let numeroDeVendas = 50;
    console.log("VALOR DA VARIÁVEL DO NÚMERO DE VENDAS: " + numeroDeVendas);
}

else if (escolha == 5) {
    let saldoDisponivel = 1000;
    console.log("VALOR DA VARIÁVEL DO SALDO DISPONÍVEL: " + saldoDisponivel);
}

else if (escolha == 6) {
    alert("Erro! Preencha todos os campos.");
}

else if (escolha == 7) {
    let mensagemDeErro = "Erro! Preencha todos os campos. (VERSÃO DA VARIÁVEL)";
    alert(mensagemDeErro);
}

else if (escolha == 8) {
    let nomePergunta = prompt("Escreva o nome: ");
    console.log("NOME INSERIDO NO PROMPT: " + nomePergunta);
}

else if (escolha == 9) {
    let idadePergunta = prompt("Escreva a idade: ");

    if (idadePergunta >= 18) {
        alert("Pode tirar a habilitação!");
    }
    
    else {
        alert("Ainda não pode tirar habilitação!");
    }
}

else {
    alert("Ocorreu um erro. Tente novamente! ");
}
