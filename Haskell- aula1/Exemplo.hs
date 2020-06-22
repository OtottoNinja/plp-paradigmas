main = do 
    print "Meu primeiro programa haskell"
    nome <- getLine
    print ("Ola mundo "++ nome)
adicionaDois:: Int -> Int 
adicionaDois x=x+2

dobro:: Int -> Int
dobro x=x+x

areaCirculo r=pi*r^2

menorTres x y z
    | x<=y && x<=z=x
    | y<=z=y
    | otherwise = z


cal_imc peso altura
    | imc <=18.5 ="Abaixo do peso!"
    | imc <=25.0 ="Peso ideal!"
    | imc <=30.0 ="Acima do peso!"
    | otherwise= "Muito acima do peso!"
    where imc = peso/altura^2

num_par:: Int -> Bool
num_par x=if mod x 2 == 0 then True else False

fatorial::Integer -> Integer
fatorial 0=1
fatorial n=n*fatorial(n-1)