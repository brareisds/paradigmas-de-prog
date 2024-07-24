module FuncoesDecisao where

ehPar :: Int -> Bool
ehPar x 
    | mod x 2 == 0 = True
    | otherwise = False

formaTriangulo :: Int -> Int -> Int -> Bool
formaTriangulo a b c
    -- | condicao = True
    | somaAB > c && somaAC > b && somaBC > a = True
    | otherwise = False
    where
        somaAB = a + b
        somaAC = a + c
        somaBC = b + c
        -- condicao = somaAB > c && somaAC > b && somaBC > a

calculaMedia :: Double -> Double -> Double -> String
calculaMedia p1 p2 p3 
    | media >= 7 = "Aprovado"
    | otherwise = "Reprovado"
    where
        media = (p1+p2+p3)/3



-- Lista exercicio

verificaIdadeG :: Int -> String
verificaIdadeG idade 
    | idade >= 18 = "Permitido"
    | otherwise = "Não permitido"

verificaIdade :: Int -> String
verificaIdade idade = if idade >= 18
    then "Permitido"
    else "Não permitido"

verificaSinalG :: Int -> String
verificaSinalG n 
    | n > 0 = "O numero eh positivo"
    | n < 0 = "O numero eh negativo"
    | otherwise = "O numero eh igual a zero"

verificaSinal :: Int -> String
verificaSinal n = if n > 0 
    then "O numero eh positivo"
    else if n < 0 then "O numero eh negativo"
    else "Igual a zero"

ehBissexto1 :: Int -> Bool
ehBissexto1 ano 
    | (mod ano 4 == 0 && mod ano 100 /= 0) || mod ano 400 == 0 = True
    | otherwise = False

ehBissexto2 :: Int -> Bool
ehBissexto2 ano = if (divisivelPor4 && naoDivisivelPor100) || divisivelPor400
    then True
    else False 
    where
        divisivelPor4 = mod ano 4 == 0
        divisivelPor400 = mod ano 400 == 0
        naoDivisivelPor100 = mod ano 100 /= 0

ehBissexto3 :: Int -> Bool
ehBissexto3 ano 
    | (divisivelPor4 && naoDivisivelPor100) || divisivelPor400 = True
    | otherwise = False
    where
        divisivelPor4 = mod ano 4 == 0
        divisivelPor400 = mod ano 400 == 0
        naoDivisivelPor100 = mod ano 100 /= 0


-- outra forma 
-- ehBissexto4 :: Int -> Bool
-- ehBissexto4 ano = divisivelPor 400 || (divisivelPor 4 && not divisivelPor 100)
--  where
--   divisivelPor x = ano `mod` x == 0








    






