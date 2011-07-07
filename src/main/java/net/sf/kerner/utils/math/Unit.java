package net.sf.kerner.utils.math;

public enum Unit implements Prefixable {

	PICO {
		@Override
		public long toPicos(long units) {
			return units;
		}

		@Override
		public long toNanos(long units) {
			return units / (C1 / C0);
		}

		@Override
		public long toMicros(long units) {
			return units / (C2 / C0);
		}

		@Override
		public long toMillis(long units) {
			return units / (C3 / C0);
		}

		@Override
		public long toUnits(long units) {
			return units / (C4 / C0);
		}

		@Override
		public long toKilos(long units) {
			return units / (C5 / C0);
		}

		@Override
		public long toMegas(long units) {
			return units / (C6 / C0);
		}

		@Override
		public long toGigas(long units) {
			return units / (C7 / C0);
		}

		@Override
		public long toTeras(long units) {
			return units / (C8 / C0);
		}

		@Override
		public long convert(long units, Unit unit) {
			return unit.toPicos(units);
		}
	},
	NANO {
		@Override
		public long toPicos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C1),
					Math.round(C0));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toNanos(long units) {
			return units;
		}

		@Override
		public long toMicros(long units) {
			return units / (C2 / C1);
		}

		@Override
		public long toMillis(long units) {
			return units / (C3 / C1);
		}

		@Override
		public long toUnits(long units) {
			return units / (C4 / C1);
		}

		@Override
		public long toKilos(long units) {
			return units / (C5 / C1);
		}

		@Override
		public long toMegas(long units) {
			return units / (C6 / C1);
		}

		@Override
		public long toGigas(long units) {
			return units / (C7 / C1);
		}

		@Override
		public long toTeras(long units) {
			return units / (C8 / C1);
		}

		@Override
		public long convert(long units, Unit unit) {
			return unit.toNanos(units);
		}

	},
	MICRO {
		@Override
		public long toPicos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C2),
					Math.round(C0));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toNanos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C2),
					Math.round(C1));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toMicros(long units) {
			return units;
		}

		@Override
		public long toMillis(long units) {
			return units / (C3 / C2);
		}

		@Override
		public long toUnits(long units) {
			return units / (C4 / C2);
		}

		@Override
		public long toKilos(long units) {
			return units / (C5 / C2);
		}

		@Override
		public long toMegas(long units) {
			return units / (C6 / C2);
		}

		@Override
		public long toGigas(long units) {
			return units / (C7 / C2);
		}

		@Override
		public long toTeras(long units) {
			return units / (C8 / C2);
		}

		@Override
		public long convert(long units, Unit unit) {
			return unit.toMicros(units);
		}
	},
	MILLI {
		@Override
		public long toPicos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C3),
					Math.round(C0));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toNanos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C3),
					Math.round(C1));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toMicros(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C3),
					Math.round(C2));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toMillis(long units) {
			return units;
		}

		@Override
		public long toUnits(long units) {
			return units / (C4 / C3);
		}

		@Override
		public long toKilos(long units) {
			return units / (C5 / C3);
		}

		@Override
		public long toMegas(long units) {
			return units / (C6 / C3);
		}

		@Override
		public long toGigas(long units) {
			return units / (C7 / C3);
		}

		@Override
		public long toTeras(long units) {
			return units / (C8 / C3);
		}

		@Override
		public long convert(long units, Unit unit) {
			return unit.toMillis(units);
		}
	},
	UNIT {
		@Override
		public long toPicos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C4),
					Math.round(C0));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toNanos(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C4),
					Math.round(C1));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toMicros(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C4),
					Math.round(C2));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toMillis(long units) {
			final long c = ArithmeticSavety.multiply(Math.round(C4),
					Math.round(C3));
			return ArithmeticSavety.multiply(Math.round(units), c);
		}

		@Override
		public long toUnits(long units) {
			return units;
		}

		@Override
		public long toKilos(long units) {
			return units / (C5 / C4);
		}

		@Override
		public long toMegas(long units) {
			return units / (C6 / C4);
		}

		@Override
		public long toGigas(long units) {
			return units / (C7 / C4);
		}

		@Override
		public long toTeras(long units) {
			return units / (C8 / C4);
		}

		@Override
		public long convert(long units, Unit unit) {
			return unit.toUnits(units);
		}
	},
	KILO {
	},
	MEGA {
	},
	GIGA {
	},
	TERA {
	};

	static final long C0 = 1;

	static final long C1 = C0 * 1000;

	static final long C2 = C1 * 1000;

	static final long C3 = C2 * 1000;

	static final long C4 = C3 * 1000;

	static final long C5 = C4 * 1000;

	static final long C6 = C5 * 1000;

	static final long C7 = C6 * 1000;

	static final long C8 = C7 * 1000;

	public long toPicos(long units) {
		throw new AbstractMethodError();
	}

	public long toNanos(long units) {
		throw new AbstractMethodError();
	}

	/**
	 * 
	 * Equivalent to UNIT.convert(units, this).
	 * 
	 * @param mass
	 *            the mass
	 * @return the converted mass
	 */
	public long toMicros(long units) {
		throw new AbstractMethodError();
	}

	public long toMillis(long units) {
		throw new AbstractMethodError();
	}

	public long toUnits(long units) {
		throw new AbstractMethodError();
	}

	public long toKilos(long units) {
		throw new AbstractMethodError();
	}

	public long toMegas(long units) {
		throw new AbstractMethodError();
	}

	public long toGigas(long units) {
		throw new AbstractMethodError();
	}

	public long toTeras(long units) {
		throw new AbstractMethodError();
	}

	public long convert(long units, Unit unit) {
		throw new AbstractMethodError();
	}

}
