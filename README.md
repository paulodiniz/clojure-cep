# clojure-cep

Clojure wrapper around the ViaCEP service

## Usage

```clojure

(viacep "85010220")

=> {"cep" "85010-220", "uf" "PR", "bairro" "Centro", "gia" "", "complemento" "de 500/501 ao fim", "logradouro" "Rua Xavier da Silva", "localidade" "Guarapuava", "unidade" "", "ibge" "4109401"}

```

## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
