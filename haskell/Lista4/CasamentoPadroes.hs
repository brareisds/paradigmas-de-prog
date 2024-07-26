
module Lista4.CasamentoPadroes where

func :: (Int, (Int,Int)) -> Int
func (1, (x, y)) = x + y
func (2, (x, y)) = x - y
func _ = 0

primeiroElemento :: (String, String, Char) -> String
primeiroElemento (x, _, _) = x

segundoElemento :: (String, String, Char) -> String
segundoElemento (_, y, _) = y

terceiroElemento :: (String, String, Char) -> Char
terceiroElemento (_, _, z) = z

contMestre :: Int -> Int
contMestre 0 = 0
contMestre n
    | segundoElemento (base n) == "mestre" = 1 + contMestre (n-1)
    | otherwise = contMestre (n-1)

contDoc :: Int -> Int
contDoc 0 = 0
contDoc n
    | segundoElemento (base n) == "doutor" = 1 + contDoc (n-1)
    | otherwise = contDoc (n-1)

contMD :: String -> Int -> Int
contMD _ 0 = 0
contMD titulo n
    | segundoElemento (base n) == titulo = 1 + contMD titulo (n-1)
    | otherwise = contMD titulo (n-1)


cont :: String -> Char -> Int -> Int
cont _ _ 0 = 0
cont titulo genero n
    | segundoElemento (base n) == titulo && terceiroElemento (base n) == genero = 1 + cont titulo genero (n-1)
    | otherwise = cont titulo genero (n-1)

type Nome = String
type Titulo = String
type Genero = Char
type Pesquisador = (Nome, Titulo, Genero)
type Grupo = [Pesquisador]

formarGrupo :: Int -> Grupo
formarGrupo 0 = []
formarGrupo n = base n : formarGrupo (n-1)

nomesDoutores :: Grupo -> [Nome]
nomesDoutores grupo = [nome | (nome, titulo, _) <- grupo, titulo == "doutor"]