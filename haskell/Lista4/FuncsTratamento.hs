module Lista4.FuncsTratamento where
-- Funcoes de alta ordem 

sr :: String -> String
sr nome = "Sr. " ++ nome

sra :: String -> String
sra nome = "Sra. " ++ nome

srta :: String -> String
srta nome = "Srta. " ++ nome

adicionarTratamento :: (String -> String) -> [String] -> [String]
adicionarTratamento _ [] = []
adicionarTratamento f (h:t) = f h : adicionarTratamento f t

ehPositivo :: Double -> Bool
ehPositivo x = x > 0

ehNegativo :: Double -> Bool
ehNegativo x = x < 0

ehZero :: Double -> Bool
ehZero x = x == 0

filtrarNumeros :: (Double -> Bool) -> [Double] -> [Double]
filtrarNumeros _ [] = []
filtrarNumeros f (h:t)
    | f h == True = h : filtrarNumeros f t
    | otherwise = filtrarNumeros f t