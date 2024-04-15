# Easy Tech
Proposta de sistema online para agendamento médico, promovendo acesso facilitado à saúde e aplicando os princípios da Sociedade 5.0 para melhorar a qualidade de vida dos pacientes.
## Integrantes

- MATHEUS MATOS - RM:99792
- KAREN VITORIA JESUS DA SILVA - RM:99468
- JULIANNY ARAUJO PEREIRA - RM:99554
- DIEGO HENRIQUE SANTOS DE OLIVEIRA - RM:550269
- JULIA DE FATIMA QUEIROZ - RM:551130

## Instruções para uso
O usuario pode cadastrar um paciente no sistema, inserindo os seguintes dados:
- CPF
- Nome Completo
- Data de Nascimento
- Telefone
- Email
- Endereço

O usuario pode atualizar os seguintes dados do paciente:
- Nome Completo
- Data de Nascimento
- Telefone
- Email
- Endereço

O usuario pode deletar um paciente do sistema, inserindo o CPF do paciente.

O usuario pode visualizar os dados de um paciente especifico, inserindo o CPF do paciente.


## Endpoints
PACIENTES
- GET `/pacientes` - Retorna a lista de pacientes cadastrados no sistema.
- POST `/pacientes` - Cadastra um novo paciente no sistema.
- GET `/pacientes/{cpf}` - Retorna os dados de um paciente específico.
- PUT `/pacientes/{cpf}` - Atualiza os dados de um paciente específico.
- DELETE `/pacientes/{cpf}` - Deleta um paciente específico.

EXAMES
- GET `/exames` - Retorna a lista de exames cadastrados no sistema.
- GET `/exames/{id_exame}` - Retorna os dados de um exame específico.

CONSULTAS
- GET `/consultas` - Retorna a lista de consultas cadastradas no sistema.
- GET `/consultas/{id_unidade}` - Retorna os dados de uma consulta específica.

AGENDAMENTOS
- GET `/agendamentos` - Retorna a lista de agendamentos cadastrados no sistema.
- GET `/agendamentos/{n_protocolo}` - Retorna os dados de um agendamento específico.

CLINICAS
- GET `/clinicas` - Retorna a lista de clinicas cadastradas no sistema.
- GET `/clinicas/{cnpj}` - Retorna os dados de uma clinica específica.
