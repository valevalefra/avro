/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// ------------------------------------------------------------------------------
// <auto-generated>
//    Generated by avrogen, version 1.10.0.0
//    Changes to this file may cause incorrect behavior and will be lost if code
//    is regenerated
// </auto-generated>
// ------------------------------------------------------------------------------
namespace Avro.Test.Specific
{
	using System;
	using System.Collections.Generic;
	using System.Text;
	using Avro;
	using Avro.Specific;
	
	public partial class EmbeddedGenericsRecord : ISpecificRecord
	{
		public static Schema _SCHEMA = Avro.Schema.Parse(@"{""type"":""record"",""name"":""EmbeddedGenericsRecord"",""namespace"":""Avro.Test.Specific"",""fields"":[{""name"":""OptionalInt"",""type"":[""null"",""int""]},{""name"":""OptionalIntList"",""type"":{""type"":""array"",""items"":[""null"",""int""]}},{""name"":""OptionalUserList"",""type"":{""type"":""array"",""items"":[""null"",{""type"":""record"",""name"":""EmbeddedGenericRecordUser"",""namespace"":""Avro.Test.Specific"",""fields"":[{""name"":""name"",""type"":""string""}]}]}},{""name"":""OptionalIntMatrix"",""type"":{""type"":""array"",""items"":{""type"":""array"",""items"":{""type"":""array"",""items"":[""null"",""int""]}}}},{""name"":""OptionalUserMatrix"",""type"":{""type"":""array"",""items"":{""type"":""array"",""items"":{""type"":""array"",""items"":[""null"",""EmbeddedGenericRecordUser""]}}}},{""name"":""IntMatrix"",""type"":{""type"":""array"",""items"":{""type"":""array"",""items"":{""type"":""array"",""items"":""int""}}}},{""name"":""UserMatrix"",""type"":{""type"":""array"",""items"":{""type"":""array"",""items"":{""type"":""array"",""items"":""EmbeddedGenericRecordUser""}}}}]}");
		private System.Nullable<System.Int32> _OptionalInt;
		private IList<System.Nullable<System.Int32>> _OptionalIntList;
		private IList<Avro.Test.Specific.EmbeddedGenericRecordUser> _OptionalUserList;
		private IList<IList<IList<System.Nullable<System.Int32>>>> _OptionalIntMatrix;
		private IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>> _OptionalUserMatrix;
		private IList<IList<IList<System.Int32>>> _IntMatrix;
		private IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>> _UserMatrix;
		public virtual Schema Schema
		{
			get
			{
				return EmbeddedGenericsRecord._SCHEMA;
			}
		}
		public System.Nullable<System.Int32> OptionalInt
		{
			get
			{
				return this._OptionalInt;
			}
			set
			{
				this._OptionalInt = value;
			}
		}
		public IList<System.Nullable<System.Int32>> OptionalIntList
		{
			get
			{
				return this._OptionalIntList;
			}
			set
			{
				this._OptionalIntList = value;
			}
		}
		public IList<Avro.Test.Specific.EmbeddedGenericRecordUser> OptionalUserList
		{
			get
			{
				return this._OptionalUserList;
			}
			set
			{
				this._OptionalUserList = value;
			}
		}
		public IList<IList<IList<System.Nullable<System.Int32>>>> OptionalIntMatrix
		{
			get
			{
				return this._OptionalIntMatrix;
			}
			set
			{
				this._OptionalIntMatrix = value;
			}
		}
		public IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>> OptionalUserMatrix
		{
			get
			{
				return this._OptionalUserMatrix;
			}
			set
			{
				this._OptionalUserMatrix = value;
			}
		}
		public IList<IList<IList<System.Int32>>> IntMatrix
		{
			get
			{
				return this._IntMatrix;
			}
			set
			{
				this._IntMatrix = value;
			}
		}
		public IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>> UserMatrix
		{
			get
			{
				return this._UserMatrix;
			}
			set
			{
				this._UserMatrix = value;
			}
		}
		public virtual object Get(int fieldPos)
		{
			switch (fieldPos)
			{
			case 0: return this.OptionalInt;
			case 1: return this.OptionalIntList;
			case 2: return this.OptionalUserList;
			case 3: return this.OptionalIntMatrix;
			case 4: return this.OptionalUserMatrix;
			case 5: return this.IntMatrix;
			case 6: return this.UserMatrix;
			default: throw new AvroRuntimeException("Bad index " + fieldPos + " in Get()");
			};
		}
		public virtual void Put(int fieldPos, object fieldValue)
		{
			switch (fieldPos)
			{
			case 0: this.OptionalInt = (System.Nullable<System.Int32>)fieldValue; break;
			case 1: this.OptionalIntList = (IList<System.Nullable<System.Int32>>)fieldValue; break;
			case 2: this.OptionalUserList = (IList<Avro.Test.Specific.EmbeddedGenericRecordUser>)fieldValue; break;
			case 3: this.OptionalIntMatrix = (IList<IList<IList<System.Nullable<System.Int32>>>>)fieldValue; break;
			case 4: this.OptionalUserMatrix = (IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>>)fieldValue; break;
			case 5: this.IntMatrix = (IList<IList<IList<System.Int32>>>)fieldValue; break;
			case 6: this.UserMatrix = (IList<IList<IList<Avro.Test.Specific.EmbeddedGenericRecordUser>>>)fieldValue; break;
			default: throw new AvroRuntimeException("Bad index " + fieldPos + " in Put()");
			};
		}
	}
}
