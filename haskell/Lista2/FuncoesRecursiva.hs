module FuncoesRecursiva where

-- recursao com guardas
calculaFatorialG :: Int -> Int
calculaFatorialG n
    | n == 0 = 1
    | n > 0 = n * calculaFatorialG (n-1)

-- recursao sem guardas
calculaFatorial :: Int -> Int 
calculaFatorial 0 = 1
calculaFatorial n = n * calculaFatorial (n-1)


potenciaG :: Int -> Int -> Int
potenciaG x n
    | n == 0 = 1
    | n > 0 = x * potenciaG x (n-1)

potencia :: Int -> Int -> Int
potencia x 0 = 1
potencia x n = x * potencia x (n-1)

somaG :: Int -> Int
somaG y
    | y == 0 = 0
    | otherwise = y + somaG (y-1)

soma :: Int -> Int
soma 0 = 0
soma y = y + soma (y-1)

-- Lista exercicio
fibonacci :: Int -> Int
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n-1) + fibonacci (n-2)

contaDigitos :: Int -> Int
contaDigitos n
    | n < 10 = 1
    | otherwise = 1 + contaDigitos (n `div` 10)

somaDigitos :: Int -> Int
somaDigitos n
    | n < 10    = n
    | otherwise = (mod n 10) + somaDigitos (div n 10)

