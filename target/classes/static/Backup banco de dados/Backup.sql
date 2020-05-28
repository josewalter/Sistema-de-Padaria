-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.7.28-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para db_padaria
CREATE DATABASE IF NOT EXISTS `db_padaria` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `db_padaria`;

-- Copiando estrutura para tabela db_padaria.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.hibernate_sequence: ~9 rows (aproximadamente)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(1),
	(1),
	(1),
	(1),
	(1),
	(1),
	(1),
	(1),
	(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_cliente
CREATE TABLE IF NOT EXISTS `tbl_cliente` (
  `cli_codigo` bigint(20) NOT NULL,
  `cli_bairro` varchar(35) NOT NULL,
  `cli_celular` varchar(14) NOT NULL,
  `cli_cep` varchar(10) NOT NULL,
  `cli_cidade` varchar(35) NOT NULL,
  `cli_cpf` varchar(15) NOT NULL,
  `cli_email` varchar(35) NOT NULL,
  `cli_endereco` varchar(35) NOT NULL,
  `cli_nome` varchar(35) NOT NULL,
  `cli_telefone_residencial` varchar(13) NOT NULL,
  `cli_uf` varchar(25) NOT NULL,
  PRIMARY KEY (`cli_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_cliente: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_contas_pagar
CREATE TABLE IF NOT EXISTS `tbl_contas_pagar` (
  `contas_pagar_codigo` bigint(20) NOT NULL,
  `contas_pagar_data_compra` datetime NOT NULL,
  `contas_pagar_data_vencimento` datetime NOT NULL,
  `contas_pagar_forma_pagamento` varchar(30) NOT NULL,
  `contas_pagar_valor` double NOT NULL,
  PRIMARY KEY (`contas_pagar_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_contas_pagar: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_contas_pagar` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_contas_pagar` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_contas_receber
CREATE TABLE IF NOT EXISTS `tbl_contas_receber` (
  `contas_receber_codigo` bigint(20) NOT NULL,
  `contas_receber_data_compra` datetime NOT NULL,
  `contas_receber_data_vencimento` datetime NOT NULL,
  `contas_receber_forma_pagamento` varchar(30) NOT NULL,
  `contas_receber_valor` double NOT NULL,
  PRIMARY KEY (`contas_receber_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_contas_receber: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_contas_receber` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_contas_receber` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_fornecedor
CREATE TABLE IF NOT EXISTS `tbl_fornecedor` (
  `for_codigo` bigint(20) NOT NULL,
  `for_bairro` varchar(35) NOT NULL,
  `for_celular` varchar(14) NOT NULL,
  `for_cep` varchar(10) NOT NULL,
  `for_cidade` varchar(35) NOT NULL,
  `for_cnpj` varchar(14) NOT NULL,
  `for_email` varchar(35) NOT NULL,
  `for_endereco` varchar(35) NOT NULL,
  `for_nome` varchar(35) NOT NULL,
  `for_telefone_comercial` varchar(13) NOT NULL,
  `for_uf` varchar(10) NOT NULL,
  PRIMARY KEY (`for_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_fornecedor: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_fornecedor` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_funcionario
CREATE TABLE IF NOT EXISTS `tbl_funcionario` (
  `fun_codigo` bigint(20) NOT NULL,
  `fun_bairro` varchar(25) NOT NULL,
  `fun_celular` varchar(15) NOT NULL,
  `fun_cep` varchar(10) NOT NULL,
  `fun_cidade` varchar(30) NOT NULL,
  `fun_cpf` varchar(15) NOT NULL,
  `fun_email` varchar(30) NOT NULL,
  `fun_endereco` varchar(35) NOT NULL,
  `fun_nome` varchar(35) NOT NULL,
  `fun_telefone_residencial` varchar(14) NOT NULL,
  `fun_uf` varchar(5) NOT NULL,
  PRIMARY KEY (`fun_codigo`),
  UNIQUE KEY `UK_gnml6u13myrhd6hbwfbanv4ti` (`fun_cpf`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_funcionario: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_funcionario` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_itens
CREATE TABLE IF NOT EXISTS `tbl_itens` (
  `iten_codigo` bigint(20) NOT NULL,
  `iten_quantidade` int(11) NOT NULL,
  `iten_valor_parcial` double NOT NULL,
  PRIMARY KEY (`iten_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_itens: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_itens` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_itens` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_nota_fiscal
CREATE TABLE IF NOT EXISTS `tbl_nota_fiscal` (
  `nota_codigo` bigint(20) NOT NULL,
  `nota_data_compra` datetime NOT NULL,
  `nota_valor_total` double NOT NULL,
  PRIMARY KEY (`nota_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_nota_fiscal: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_nota_fiscal` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_nota_fiscal` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_produto
CREATE TABLE IF NOT EXISTS `tbl_produto` (
  `pro_codigo` bigint(20) NOT NULL,
  PRIMARY KEY (`pro_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_produto: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_produto` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_relatorio
CREATE TABLE IF NOT EXISTS `tbl_relatorio` (
  `rel_codigo` bigint(20) NOT NULL,
  `rel_cliente` varchar(35) NOT NULL,
  `rel_data_venda` datetime NOT NULL,
  `rel_funcionario` varchar(35) NOT NULL,
  `rel_nome_produto` varchar(35) NOT NULL,
  `rel_valor_produto` double NOT NULL,
  PRIMARY KEY (`rel_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_relatorio: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_relatorio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_relatorio` ENABLE KEYS */;

-- Copiando estrutura para tabela db_padaria.tbl_venda
CREATE TABLE IF NOT EXISTS `tbl_venda` (
  `ven_codigo` bigint(20) NOT NULL,
  `ven_horario` datetime NOT NULL,
  `ven_nome_produto` varchar(35) NOT NULL,
  `ven_valor_total` double NOT NULL,
  PRIMARY KEY (`ven_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela db_padaria.tbl_venda: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `tbl_venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_venda` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
