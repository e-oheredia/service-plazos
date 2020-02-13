USE [db_service_plazos]

SET IDENTITY_INSERT [dbo].[tipo_plazo] ON 

INSERT [dbo].[tipo_plazo] ([tipo_plazo_id], [nombre]) VALUES (1, N'REGULAR')
INSERT [dbo].[tipo_plazo] ([tipo_plazo_id], [nombre]) VALUES (2, N'ESPECIAL')
SET IDENTITY_INSERT [dbo].[tipo_plazo] OFF
SET IDENTITY_INSERT [dbo].[plazo] ON 
<<<<<<< HEAD

INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id]) VALUES (1, N'ESTÁNDAR', 96, 1)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id]) VALUES (2, N'72 HORAS', 72, 2)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id]) VALUES (3, N'48 HORAS', 48, 2)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id]) VALUES (4, N'24 HORAS', 24, 2)
SET IDENTITY_INSERT [dbo].[plazo] OFF
=======
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id], [activo]) VALUES (1, N'ESTÁNDAR', 96, 1, 1)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id], [activo]) VALUES (2, N'72 HORAS', 72, 2, 1)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id], [activo]) VALUES (3, N'48 HORAS', 48, 2, 1)
INSERT [dbo].[plazo] ([plazo_id], [nombre], [tiempo_envio], [tipo_plazo_id], [activo]) VALUES (4, N'24 HORAS', 24, 2, 1)
SET IDENTITY_INSERT [dbo].[plazo] OFF
>>>>>>> branch 'master' of https://github.com/e-oheredia/service-plazos.git
