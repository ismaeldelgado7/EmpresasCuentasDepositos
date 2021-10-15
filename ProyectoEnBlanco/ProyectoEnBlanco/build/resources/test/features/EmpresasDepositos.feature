# language: es
# encoding: UTF8
@estadofinanciero
Característica: Reto tecnico
  Yo como Talento del Proyecto
  Quiero entrar la pagina del reto tecnico
  Para obtener los resultados

  @tag1
  Escenario: Empresas documentos cuenta de ahorro comercial
    Dado Ingreso A La Pagina De Banistmo Portal Empresas
    Cuando Hago Click Productos y Servicios
    Y Hago CLick En Depositos
    Y Hago Click En Cuenta de Ahorro Comercial
    Y Hago Click En Documentos
    Y Hago Click En Contrato Unico
    Entonces Debería Mostrarme El PDF Con Informacion De Contratos

