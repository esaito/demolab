/*
 Demoiselle Framework
  ============================================================================
 This file is part of Demoiselle Framework.
 Demoiselle Framework is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License version 3
 as published by the Free Software Foundation.
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.
 You should have received a copy of the GNU Lesser General Public License version 3
 along with this program; if not,  see <http://www.gnu.org/licenses/>
 or write to the Free Software Foundation, Inc., 51 Franklin Street,
 Fifth Floor, Boston, MA  02110-1301, USA.
 ============================================================================
 Este arquivo é parte do Framework Demoiselle.
 O Framework Demoiselle é um software livre; você pode redistribuí-lo e/ou
 modificá-lo dentro dos termos da GNU LGPL versão 3 como publicada pela Fundação
 do Software Livre (FSF).
 Este programa é distribuído na esperança que possa ser útil, mas SEM NENHUMA
 GARANTIA; sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou
 APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU/LGPL em português
 para maiores detalhes.
 Você deve ter recebido uma cópia da GNU LGPL versão 3, sob o título
 "LICENCA.txt", junto com esse programa. Se não, acesse <http://www.gnu.org/licenses/>
 ou escreva para a Fundação do Software Livre (FSF) Inc.,
 51 Franklin St, Fifth Floor, Boston, MA 02111-1301, USA.
 */
package org.demoiselle.cruxframework.bookmark.client.shared.messages;

import org.cruxframework.crux.core.client.i18n.MessageName;

import com.google.gwt.i18n.client.Messages;

@MessageName("commonMessages")
public interface CommonMessages extends Messages
{
	@DefaultMessage("Bookmark")
	String title();

	@DefaultMessage("Bookmark")
	String menuBookmark();
	
	@DefaultMessage("Novo")
	String menuNew();
	
	@DefaultMessage("Listar")
	String menuList();
	
	@DefaultMessage("Link: ")
	String addLink();
	
	@DefaultMessage("Descri\u00E7\u00E3o: ")
	String addDescription();
	
	@DefaultMessage("Salvar")
	String addSave();
	
	@DefaultMessage("Descri\u00E7\u00E3o")
	String listDescription();
	
	@DefaultMessage("Link")
	String listLink();
	
	@DefaultMessage("A\u00E7\u00E3o")
	String listAction();
	
	@DefaultMessage("Id")
	String listId();
	
	@DefaultMessage("Editar")
	String listEdit();
	
	@DefaultMessage("Novo")
	String listNew();
	
	@DefaultMessage("Excluir")
	String listDelete();
	
	@DefaultMessage("Sair")
	String menuQuit();
	
	@DefaultMessage("Preencha todos os campos.")
	String fillMessage();
	
	@DefaultMessage("Salvo com sucesso!")
	String successfullyMessage();
	
	@DefaultMessage("Excluido com Sucesso!")
	String removeMessage();
	
	
	
	@DefaultMessage("Bem-vindo \u00E0 aplica\u00E7\u00E3o de exemplo Bookmark. Este \u00E9 o seu ponto de partida, portanto sinta-se \u00E0 vontade para modificar esta aplica\u00E7\u00E3o.")
	String home();
	
}

