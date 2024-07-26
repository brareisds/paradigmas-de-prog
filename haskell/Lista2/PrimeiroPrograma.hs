module Lista2.PrimeiroPrograma where

-- Primeira parte: base de dados
-- declaracao dos numeros reais de uma sequencia
num :: Int -> Double
num 1 = 5.0
num 2 = 10.0
num 3 = 15.0
num 4 = 20.0
num 5 = 25.0 -- a funcao num recebe 5 como entrada e retorna 25.0

-- Segunda Parte: Funcao recursiva (soma)
-- Implementa uma funcao recursiva para somar todos os numeros retornados
-- pelas funcoes da base de dados (num 1 + num 2 + ... num 5)
somaNumeros :: Int -> Double
somaNumeros 0 = 0
somaNumeros n = num n + somaNumeros (n-1)

-- Terceira Parte: Funcao media (nao recursiva)
calculaMedia :: Int -> Double
calculaMedia n = (somaNumeros n) / (fromIntegral n)