CREATE TABLE  IF NOT EXISTS `reinos` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `nome` varchar(100) NOT NULL,
    `descricao` text DEFAULT NULL,
    `localizacao` text DEFAULT NULL,
    `afiliacao` varchar(60) DEFAULT NULL,
    `img` MEDIUMBLOB  DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ;