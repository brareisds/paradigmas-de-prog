module Lista3.ListasRecursivas where

somaLista :: [Int] -> Int
somaLista [] = 0
somaLista (h:t) = h + somaLista t

removePares :: [Int] -> [Int]
removePares [] = []
removePares (h:t)
    | mod h 2 == 0 = removePares t
    | otherwise = h : removePares t

inverteLista :: [Double] -> [Double]
inverteLista [] = []
inverteLista (h:t) = inverteLista t ++ [h]

filtraNomes :: [String] -> [String]
filtraNomes [] = []
filtraNomes (h:t)
    | head h == 'A' = h : filtraNomes t
    | otherwise = filtraNomes t

-- listas por compreensao
a = [x * 3 | x <- [0..5]]
b = [[x] | x <- [1..5]]

multiplos :: Int -> (Int, Int, Int, Int)
multiplos n = (2*n, 3*n, 4*n, 5*n)

divisaoEParidade :: Int -> (Int, String)
divisaoEParidade n1
    | mod n1 2 == 0 = (div n1 2, "par")
    | otherwise = (div n1 2, "impar")

somaEProduto :: [Int] -> (Int, Int)
somaEProduto [] = (0, 1)
somaEProduto (h:t)
    | h > 0 = (h + soma, produto)
    | otherwise = (soma, h * produto)
    where (soma, produto) = somaEProduto t

type Nome = String
type Avaliacao = Int
type Tipo = String
type PontoTuristico = (Nome, Avaliacao, Tipo)
type Nota = (Nome, Avaliacao)

filtraPontos :: [PontoTuristico] -> Avaliacao -> [Nota]
filtraPontos pontos avaliacaoReferencia = [(nome, avaliacao) | (nome, avaliacao, tipo) <- pontos, avaliacao > avaliacaoReferencia, tipo == "parque" || tipo == "museu"]