import Lista4.FuncsTratamento 

main :: IO ()
main = do
    let nomesHomens = ["Joao", "Pedro", "Lucas"]
    let nomesMulheresCasadas = ["Maria", "Ana", "Luiza"]
    let nomesMulheresSolteiras = ["Julia", "Fernanda", "Carla"]

    let numeros = [-1,9,0,7,-5,0]

    print (adicionarTratamento sr nomesHomens)
    print (adicionarTratamento sra nomesMulheresCasadas)
    print (adicionarTratamento srta nomesMulheresSolteiras)

    print (filtrarNumeros ehPositivo numeros)
    print (filtrarNumeros ehNegativo numeros)
    print (filtrarNumeros ehZero numeros)