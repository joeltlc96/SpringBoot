SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO

ALTER PROCEDURE [dbo].[SP_DEL_USUARIO]
   @PI_ID_USUARIO integer,
   @PI_USUARIO_MODICFICACION INTEGER


AS

BEGIN
   UPDATE USUARIOS
   SET ESTADO='I',
   USUARIO_MODIFICACION=@PI_USUARIO_MODICFICACION,
   FECHA_MODIFICACION=GETDATE() 

WHERE
  ID_USUARIO=@PI_ID_USUARIO


END