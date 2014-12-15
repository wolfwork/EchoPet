/*
 * This file is part of EchoPet.
 *
 * EchoPet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EchoPet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EchoPet.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.dsh105.echopet.compat.nms.v1_7_R2.entity.type;

import com.dsh105.echopet.compat.api.entity.*;
import com.dsh105.echopet.compat.api.entity.type.nms.IEntitySquidPet;
import com.dsh105.echopet.compat.nms.v1_7_R2.entity.EntityPet;
import net.minecraft.server.v1_7_R2.World;

@EntitySize(width = 0.95F, height = 0.95F)
@EntityPetType(petType = PetType.SQUID)
public class EntitySquidPet extends EntityPet implements IEntitySquidPet {

    public EntitySquidPet(World world) {
        super(world);
    }

    public EntitySquidPet(World world, IPet pet) {
        super(world, pet);
    }

    @Override
    protected String getIdleSound() {
        return "";
    }

    @Override
    protected String getDeathSound() {
        return null;
    }

    @Override
    public SizeCategory getSizeCategory() {
        return SizeCategory.REGULAR;
    }
}